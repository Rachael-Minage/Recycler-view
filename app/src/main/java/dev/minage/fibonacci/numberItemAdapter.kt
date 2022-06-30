package dev.minage.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberItemAdapter(var numlist:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_holder,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvViewHolder.text = numlist.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numlist.size
    }
}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvViewHolder = itemView.findViewById<TextView>(R.id.tvViewHolder)
}