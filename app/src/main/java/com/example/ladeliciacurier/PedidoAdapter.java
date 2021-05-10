package com.example.ladeliciacurier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ladeliciacurier.model.Pedido;

import java.util.List;

public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.PedidoViewHolder>{

    private Context mCtx;
    private List<Pedido> productList;

    public PedidoAdapter(Context mCtx, List<Pedido> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public PedidoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_element, null);
        return new PedidoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PedidoViewHolder holder, int position) {
        Pedido pedido = productList.get(position);

        //loading the image
       /* Glide.with(mCtx)
                .load(pedido.getImage())
                .into(holder.imageView);
        */
        holder.txtnombrecliente.setText(pedido.getUser_nom());
        holder.txtnombrepedido.setText(pedido.getDes_pedido());
        holder.txtprecio.setText(String.valueOf(pedido.getPre_pedido()));
        holder.numerocliente.setText(String.valueOf(pedido.getUser_tel()));
        holder.txthorapedido8.setText(pedido.getHora_entrega());
        holder.txtdirllegada.setText(String.valueOf(pedido.getUser_dir()));
        holder.mediopagocliente.setText(pedido.getMedio_pago());
        if (pedido.getEstado() == 0){
            holder.txtestado.setText("Preparando");
        }else if(pedido.getEstado() == 1){
            holder.txtestado.setText("En Camino");
        }else{
            holder.txtestado.setText("Entregado");
        }

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class PedidoViewHolder extends RecyclerView.ViewHolder {

        TextView txtnombrecliente, txtnombrepedido, txtprecio, numerocliente,mediopagocliente,txthorapedido8,txtdirllegada,txtestado;
        ImageView imageView;

        public PedidoViewHolder(View itemView) {
            super(itemView);

            txtnombrecliente = itemView.findViewById(R.id.txtnombrecliente);
            txtnombrepedido = itemView.findViewById(R.id.txtnombrepedido);
            txtprecio = itemView.findViewById(R.id.txtprecio);
            numerocliente = itemView.findViewById(R.id.numerocliente);
            mediopagocliente = itemView.findViewById(R.id.mediopagocliente);
            txthorapedido8 = itemView.findViewById(R.id.txthorapedido8);
            txtdirllegada = itemView.findViewById(R.id.txtdirllegada);
            txtestado = itemView.findViewById(R.id.txtestado);

        }
    }
}
