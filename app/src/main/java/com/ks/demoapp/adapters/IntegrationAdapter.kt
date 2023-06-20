package com.ks.demoapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ks.demoapp.databinding.ItemComponentBinding
import com.ks.demoapp.model.UIComponent


class IntegrationAdapter : RecyclerView.Adapter<IntegrationAdapter.ComponentViewHolder>() {
    private val components = mutableListOf<UIComponent>()

    fun setData(data: List<UIComponent>) {
        components.clear()
        components.addAll(data)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): IntegrationAdapter.ComponentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemComponentBinding = ItemComponentBinding.inflate(inflater, parent, false)
        return ComponentViewHolder(binding)
    }

    override fun onBindViewHolder(holder:ComponentViewHolder, position: Int) {
        holder.bind(components[position])

    }

    override fun getItemCount(): Int {
        return components.size
    }
     inner class ComponentViewHolder(private val binding : ItemComponentBinding): RecyclerView.ViewHolder(binding.root){
         fun bind(component : UIComponent){
             binding.component = component
             binding.executePendingBindings()

         }
     }


}