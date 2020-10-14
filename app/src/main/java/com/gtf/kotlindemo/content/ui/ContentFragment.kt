package com.gtf.kotlindemo.content.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.gtf.kotlindemo.R
import com.gtf.kotlindemo.content.viewmodel.ContentViewModel
import com.gtf.kotlindemo.databinding.FragmentContentLayoutBinding

/**
 * Created by getengfei on 2020-09-29.
 */
class ContentFragment : Fragment() {

    companion object {
        private val TAG = "ContentFragment"
    }

    private lateinit var contentViewModel: ContentViewModel
    private lateinit var viewBinding: FragmentContentLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        contentViewModel = ContentViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView")
        viewBinding = DataBindingUtil
            .inflate(layoutInflater, R.layout.fragment_content_layout, null, false)
        viewBinding.content = contentViewModel
        return viewBinding.root
    }

    override fun onStart() {
        Log.i(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

}