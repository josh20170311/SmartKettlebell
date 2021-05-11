package com.josh.smartkettlebell.ui.scan;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.josh.smartkettlebell.R;

import java.util.LinkedList;


public class DeviceListAdapter extends RecyclerView.Adapter<DeviceListAdapter.DeviceViewHolder>{


    private static final String TAG = "myTAG";
    private final LinkedList<ScanResult> deviceList = new LinkedList<>();
    private Context context;

    @NonNull
    @Override
    public DeviceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_device,parent,false);
        context = parent.getContext();
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceViewHolder holder, int position) {
        String address = deviceList.get(position).getDevice().getAddress();
        String name = deviceList.get(position).getDevice().getName();
        holder.tv_itemName.setText(name);
        holder.tv_itemAddr.setText(address);
        holder.tv_itemRssi.setText(String.valueOf(deviceList.get(position).getRssi()));
        holder.itemView.setOnClickListener(e -> ((DeviceScanActivity)context).onItemClicked(address));
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public void addDevice(ScanResult r){
        for(ScanResult rr:deviceList){
            if(rr.getDevice().getAddress().equals(r.getDevice().getAddress())) {
                deviceList.remove(rr);
                break;
            }
        }
        deviceList.add(0,r);
    }


    public static class DeviceViewHolder extends RecyclerView.ViewHolder{
        TextView tv_itemName;
        TextView tv_itemRssi;
        TextView tv_itemAddr;


        public DeviceViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_itemName = itemView.findViewById(R.id.tv_itemName);
            tv_itemRssi = itemView.findViewById(R.id.tv_itemRssi);
            tv_itemAddr = itemView.findViewById(R.id.tv_itemAddr);

        }
    }
}
