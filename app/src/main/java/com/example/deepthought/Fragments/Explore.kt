package com.example.deepthought.Fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.load.HttpException
import com.example.deepthought.API.RetrofitInstance
import com.example.deepthought.Adapters.ProjectAdapter
import com.example.deepthought.R
import com.example.deepthought.databinding.FragmentExploreBinding
import com.example.deepthought.model.JsonData
import java.io.IOException

class Explore : Fragment(R.layout.fragment_explore) {

    private lateinit var binding: FragmentExploreBinding

    private lateinit var projectAdapter: ProjectAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(inflater, container, false)

        setupRecyclerView()



        //The below commented portion is to render the data from the json into their respective views.


        /*lifecycleScope.launchWhenCreated {

            val response = try {
                RetrofitInstance.api.getProjects()
            } catch(e: IOException) {
                Log.e(TAG, "IOException, you might not have internet connection")

                return@launchWhenCreated
            } catch (e: HttpException) {
                Log.e(TAG, "HttpException, unexpected response")

                return@launchWhenCreated
            }
            if(response.isSuccessful && response.body() != null) {
                projectAdapter.projects = response.body()!!


            } else {
                Log.e(TAG, "Response not successful")
            }

        }*/

        return binding.root
    }


    private fun setupRecyclerView() = binding.recyclerViewProject.apply {
        projectAdapter = ProjectAdapter()
        adapter = projectAdapter
        layoutManager = LinearLayoutManager(context)
    }


}















   /* override fun onAttach(context: Context) {
        Log.d(Constraints.TAG, "onAttach")
        super.onAttach(context)

        getJsonData()
    }


    private lateinit var binding: FragmentExploreBinding
    private lateinit var viewModel: ProjectViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }

        getJsonData()



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root

    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(ProjectViewModel::class.java)
        getJsonData()


    }

    private fun getJsonData(){
        JSONApi().getJSONData().enqueue(object : Callback<List<JsonData>> {
            override fun onResponse(call: Call<List<JsonData>>, response: Response<List<JsonData>>) {

                val projectData =  response.body()

                projectData?.let {
                    showProjects(it)
                }

            }

            override fun onFailure(call: Call<List<JsonData>>, t: Throwable) {
                Toast.makeText(activity, "Not able to fetch API", Toast.LENGTH_LONG).show()
            }

        })
    }

    private fun showProjects(jsonData: List<JsonData>) {

        binding.recyclerViewProject.layoutManager = LinearLayoutManager(activity)
        binding.recyclerViewProject.setHasFixedSize(true)
        binding.recyclerViewProject.adapter = projectListAdapter(this, jsonData)
    }


*/


