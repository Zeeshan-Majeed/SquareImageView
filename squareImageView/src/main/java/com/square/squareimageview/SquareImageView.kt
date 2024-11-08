package com.square.squareimageview

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.utils.widget.ImageFilterView

/** @author:Zeeshan
 * 10/11/2024
 *
 * Width is always equal to height
 * eg: width is 100dp height will automatically 100dp, no matter wat was original height
 * It have ImageFilterView properties
 *
 * */

class SquareImageView : ImageFilterView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = measuredWidth
        setMeasuredDimension(width, width)
    }
}