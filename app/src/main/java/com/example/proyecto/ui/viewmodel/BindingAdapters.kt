package com.example.proyecto.ui.viewmodel

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.data.model.Vars
import com.example.proyecto.ui.adapter.AdapterList

@BindingAdapter("visible")
fun bindVisible(view: View?,visible:Boolean?){
  view?.visibility = if(visible==true) View.VISIBLE else View.GONE
 }

@BindingAdapter("data")
fun setRecyclerViewProperties(recyclerView: RecyclerView?, data: MutableList<Vars>?) {
    val adapter = recyclerView?.adapter
    if (adapter is AdapterList && data != null) {
        adapter.setData(data)
    }


}
@BindingAdapter("onTouchListener")
fun setTouchListener(view: View, listener: View.OnTouchListener) {
    view.setOnTouchListener(listener)
}