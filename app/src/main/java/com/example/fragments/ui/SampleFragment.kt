package com.example.fragments.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragments.R

private const val TAG = "TAGS"
class SampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sample,container,false)
        Log.d(TAG, "Sample fragment onCreateView: ")
        return view
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Sample fragment onStart: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Sample fragment onStop: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Sample fragment onpause: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "Sample fragment ondetach: ")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Sample fragment onAttach: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Sample fragment onDestroyView: ")
    }


    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Sample fragment onResume: ")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(com.example.fragments.TAG, "Sample fragment onActivity created: ")

    }
}