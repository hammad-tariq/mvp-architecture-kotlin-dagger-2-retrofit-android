package com.es.developine.ui.posts

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.es.developine.R
import com.es.developine.data.PostData
import com.es.developine.ui.BaseActivity
import com.es.developine.ui.adapters.PostItemAdapter
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : BaseActivity(), PostView {


   var postPresenter: PostPresenterImpl?=null


    override fun setLayout(): Int {

        return R.layout.activity_post;
    }

    override fun init(savedInstanceState: Bundle?) {
      //  postPresenter.getAllPosts()
        getPresenter()?.let {
            it.getAllPosts()
        }
    }

    fun getPresenter(): PostPresenterImpl?{
        postPresenter = PostPresenterImpl(this, application)
        return postPresenter
    }


    override fun showAllPosts(postList: List<PostData>) {

        Log.d("Response", "" + postList)

        rv_post_list.layoutManager = LinearLayoutManager(this)
        rv_post_list.adapter = PostItemAdapter(postList, this)
    }




    override fun onStartScreen() {
    }

    override fun stopScreen() {
        postPresenter?.let {
            postPresenter!!.unbindView()
            postPresenter = null
        }

    }




}
