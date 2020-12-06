package com.sambudisp.animation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.sambudisp.animation.databinding.FragmentImageBinding

class ImageFragment : Fragment(R.layout.fragment_image) {


    private var _binding: FragmentImageBinding? = null
    private val binding: FragmentImageBinding get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentImageBinding.bind(view)

        binding.clSearch.setOnClickListener {
            goSearch()
        }
        binding.edtPencarian.setOnClickListener {
            goSearch()
        }
    }

    private fun goSearch() {
        val extras = FragmentNavigatorExtras(binding.clSearch to "search_top")
        findNavController().navigate(
            R.id.action_imageFragment_to_searchFragment, null, null,
            extras
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }
}