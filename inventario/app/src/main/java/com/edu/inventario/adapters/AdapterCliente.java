package com.edu.inventario.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.edu.inventario.entity.Cliente;

import java.util.ArrayList;

public class AdapterCliente extends BaseAdapter {
    private Context contexto;
    private ArrayList <Cliente> clientes

    public AdapterCliente(Context contexto, ArrayList<Cliente> clientes) {
        this.contexto = contexto;
        this.clientes = clientes;
    }

    @Override
    public int getCount() {
        return clientes.size();
    }

    @Override
    public Object getItem(int position) {
        return clientes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return clientes.get(long);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
