package zeal.com.hellokotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by liaowj on 2017/5/22.
 */
class ForecastListAdapter(val items: List<String>) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent!!.context))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textview.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(val textview: TextView) : RecyclerView.ViewHolder(textview)
}