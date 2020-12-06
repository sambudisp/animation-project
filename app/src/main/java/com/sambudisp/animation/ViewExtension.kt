package com.sambudisp.animation

import android.view.View
import android.view.animation.AnimationUtils
import androidx.interpolator.view.animation.FastOutSlowInInterpolator

fun View.slideUp(animTime : Long, startOffset : Long){
    val slideUp = AnimationUtils.loadAnimation(context, R.anim.slide_up).apply {
        duration = animTime
        interpolator = FastOutSlowInInterpolator()
        this.startOffset = startOffset
    }
    startAnimation(slideUp)
}

fun View.fadeOut(animTime : Long, startOffset : Long){
    val slideUp = AnimationUtils.loadAnimation(context, R.anim.fade_out).apply {
        duration = animTime
        interpolator = FastOutSlowInInterpolator()
        this.startOffset = startOffset
    }
    startAnimation(slideUp)
}