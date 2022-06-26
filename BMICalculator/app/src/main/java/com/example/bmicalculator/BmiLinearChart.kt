package com.example.bmicalculator

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.example.bmicalculator.R
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class BmiLinearChart : AppCompatActivity() {
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        val view = super.onCreateView(name, context, attrs)
        val graph = view!!.findViewById<View>(R.id.graph) as GraphView
        val series = LineGraphSeries(
            arrayOf<DataPoint>(
                DataPoint(0, 1),
                DataPoint(1, 5),
                DataPoint(2, 3),
                DataPoint(3, 2),
                DataPoint(4, 6)
            )
        )
        graph.addSeries(series)
        return view
    }
}