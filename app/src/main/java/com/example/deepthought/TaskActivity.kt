package com.example.deepthought

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.deepthought.databinding.ActivityTaskBinding

class TaskActivity : AppCompatActivity() {


    //A recyclerView is set in the compressed Side view to display the task and asset names .
    //The single item design for this is the assetId_list_item.xml (According to the first figma file provided)
    //The single item for the expanded journey board is the journeyboard_assetlistname_singleitem.xml
    //I have not completed with the animation or the transition from the list id to the list details in the journey board, but completed with the design.

    /*Since the task provided was changed , i was not able to complete the figma file for the task 1 second page.(where expandable multiview recyclerView was used.
    So i have not done that. If you can provide me with the figma file again, i can design the expandable multiview recyclerView if required*/

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTaskBinding

    private var isAssetListExpanded = false
    private var isNoticeExpanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTaskBinding.inflate(layoutInflater)

        binding.compressableSideView.setX(-97f)
        binding.noticeBoard.setX(-665f)

        setContentView(binding.root)

    }

    fun journeyBoardClickFunc(view: View){
        if (isAssetListExpanded == false){
            view.animate().translationX(7f).setDuration(500)
            isAssetListExpanded = true
        }else{
            view.animate().translationX(-97f).setDuration(500)
            isAssetListExpanded = false
        }
    }

    fun noticeBoardClickFunc(view: View){
        if (isNoticeExpanded == false){
            view.animate().translationX(1f).setDuration(500)
            isNoticeExpanded = true
        }
    }

    fun noticeBoardClose(view: View) {
        binding.noticeBoard.animate().translationX(-665f).setDuration(500)
        isNoticeExpanded = false
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_task)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}