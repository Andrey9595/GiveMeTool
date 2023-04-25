package ru.anb.givemetool.ui.start


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.anb.givemetool.R
import ru.anb.givemetool.data.StartItem
import ru.anb.givemetool.databinding.FragmentStartBinding
import ru.anb.givemetool.ui.adapters.StartAdapter

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val mBinding get() = _binding!!
    private val startAdapter: StartAdapter = StartAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.startAdapter.adapter = startAdapter
        startAdapter.setData(
            listOf(
                StartItem(1, R.drawable.ic_basket, "test1"),
                StartItem(2, R.drawable.ic_home, "test2"),
                StartItem(3, R.drawable.ic_message, "test3")
            )
        )
    }
}