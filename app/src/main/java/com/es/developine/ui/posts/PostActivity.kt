package com.es.developine.ui.posts

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.es.developine.ApplicationClass
import com.es.developine.R
import com.es.developine.data.PostData
import com.es.developine.ui.login.LoginPresenter
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity(), PostView {


    lateinit var postPresenter: PostPresenter


    override fun showAllPosts(postList: List<PostData>) {

        Log.d("Response", "" + postList)

        rv_post_list.layoutManager = LinearLayoutManager(this)
        rv_post_list.adapter = PostItemAdapter(postList, this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)


        postPresenter = PostPresenterImpl(this, application)

        postPresenter.getAllPosts()
    }

}
