/*package com.example.deepthought.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.deepthought.R
import com.example.deepthought.model.JsonData

class projectListAdapter(
   val context: Fragment,
   val projectData: List<JsonData>): RecyclerView.Adapter<projectListAdapter.projectViewHolder>() {

    //var dataList = ArrayList<JsonData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): projectViewHolder {
        return projectViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_explore, parent,false)
        )
    }

    override fun getItemCount() = projectData.size

    override fun onBindViewHolder(holder: projectViewHolder, position: Int) {
        val project = projectData[position]

        holder.projectTitle.text = project.title
        holder.projectDescription.text = project.description
        holder.learningOutcomeDesc.text = project.learning_outcomes.toString()
        holder.preRequisitesDesc.text = project.pre_requisites.toString()
        holder.typeOfProject.text = project.type
        //holder.authorName.text = project.

        Glide.with(context).load(project.project_image).into(holder.projectImage)
        //Glide.with(context).load(project.project_image).into(holder.profileDp)

    }

    class projectViewHolder(val view: View): RecyclerView.ViewHolder(view){

        var projectTitle = view.findViewById<TextView>(R.id.titlePro)
        var projectDescription = view.findViewById<TextView>(R.id.DescPro)
        var learningOutcomeDesc = view.findViewById<TextView>(R.id.learningOutDescPro)
        var preRequisitesDesc = view.findViewById<TextView>(R.id.preRequisitesDesc)
        var typeOfProject = view.findViewById<TextView>(R.id.typeSelect)
        var authorName = view.findViewById<TextView>(R.id.nameOfAuthor)

        var projectImage: ImageView = view.findViewById(R.id.projectImage)
        var profileDp: ImageView = view.findViewById(R.id.profileDp)

    }



}*/