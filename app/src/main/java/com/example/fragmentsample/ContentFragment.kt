package com.example.fragmentsample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*

class ContentFragment : Fragment() {

    private lateinit var name : String
    private lateinit var surName : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {_arguments ->
            name = _arguments.getString("name")
            surName = _arguments.getString("surName")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtFullName.text = "$name $surName"

    }

    companion object {
        /*fun newInstance(name: String, surName:String):ContentFragment{

            val contentFragment = ContentFragment().apply {

            }
            val bundle = Bundle()

            contentFragment.arguments = Bundle()
            bundle.putString("name", name)
            bundle.putString("surName", surName)

            return ContentFragment()
        }*/
        fun newInstance(name: String, surName:String)=ContentFragment().apply {
            arguments = Bundle().apply {
                putString("name", name)
                putString("surname", surName)
            }
        }
    }


}
