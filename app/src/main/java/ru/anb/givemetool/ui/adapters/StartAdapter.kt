package ru.anb.givemetool.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.anb.givemetool.data.StartItem
import ru.anb.givemetool.databinding.StartlistBinding

class StartAdapter() : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    class StartViewHolder(val binding: StartlistBinding) : RecyclerView.ViewHolder(binding.root)

    private var startItems: List<StartItem> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        return StartViewHolder(
            StartlistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        val item = startItems[position]
        with(holder.binding) {
            startImage.setImageResource(item.image)
            startText.text = item.description
        }
    }

    override fun getItemCount() = startItems.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<StartItem>) {
        startItems = data
        notifyDataSetChanged()
    }
}