package com.example.fragment_instagram.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.fragment_instagram.R
import com.example.fragment_instagram.databinding.FragmentLikeBinding

class LikeFragment : Fragment() {

    private val binding by lazy { FragmentLikeBinding.inflate(layoutInflater)}
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.apply {
            webview.webViewClient = WebViewClient()

            webview.apply {
                loadUrl("https://youtube.com/shorts/807WTmzPURM?feature=share")
                settings.javaScriptEnabled = true
                settings.safeBrowsingEnabled = true
            }

        }

        return binding.root
    }

}