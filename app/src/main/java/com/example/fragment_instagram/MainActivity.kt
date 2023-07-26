package com.example.fragment_instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.fragment_instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        findNavController(R.id.my_navigation_host).navigate(R.id.homeFragment3, bundleOf())
        binding.apply {
            home.setOnClickListener {
                findNavController(R.id.my_navigation_host).navigate(R.id.homeFragment3)
                home.setImageResource(R.drawable.homeblank)
                search.setImageResource(R.drawable.searchline)
                add.setImageResource(R.drawable.addline)
                like.setImageResource(R.drawable.videoblank)
                profile.setImageResource(R.drawable.profileblank)
            }
            search.setOnClickListener {
                home.setImageResource(R.drawable.homeline)
                search.setImageResource(R.drawable.searchblank)
                add.setImageResource(R.drawable.addline)
                like.setImageResource(R.drawable.videoblank)
                profile.setImageResource(R.drawable.profileblank)
                findNavController(R.id.my_navigation_host).navigate(R.id.searchFragment3)
            }
            add.setOnClickListener {
                home.setImageResource(R.drawable.homeline)
                search.setImageResource(R.drawable.searchline)
                add.setImageResource(R.drawable.addblank)
                like.setImageResource(R.drawable.videoblank)
                profile.setImageResource(R.drawable.profileblank)

                val galleryIntent = Intent(Intent.ACTION_PICK)
                galleryIntent.type = "image/*"
                startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE)

                findNavController(R.id.my_navigation_host).navigate(R.id.addFragment3)
            }
            like.setOnClickListener {
                home.setImageResource(R.drawable.homeline)
                search.setImageResource(R.drawable.searchline)
                add.setImageResource(R.drawable.addline)
                like.setImageResource(R.drawable.videoline)
                profile.setImageResource(R.drawable.profileblank)
                findNavController(R.id.my_navigation_host).navigate(R.id.likeFragment3)
            }
            profile.setOnClickListener {
                home.setImageResource(R.drawable.homeline)
                search.setImageResource(R.drawable.searchline)
                add.setImageResource(R.drawable.addline)
                like.setImageResource(R.drawable.videoblank)
                profile.setImageResource(R.drawable.profileline)
                findNavController(R.id.my_navigation_host).navigate(R.id.profileFragment3)
            }
        }

    }

    companion object {
        private const val GALLERY_REQUEST_CODE = 123
    }
}