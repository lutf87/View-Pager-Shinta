package com.shinta.viewpagershinta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_friends.*

class FriendsFragment: Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>
    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Ali Rondli S.E", "Laki-Laki", "alirondli09@gmail.com",
                "+62 857-0703-0786", "Mlonggo-Jepara")
        )
        listTeman.add(
            MyFriend("Achmad Najam", "Laki-Laki", "achmadkholidin3@gmail.com",
            "+62 812-2576-9957", "Tahunan-jepara")
        )
        listTeman.add(
            MyFriend("Siti Risma Nur Rohma Yanti", "Perempuan", "rismariiss29@gmail.com",
            "+62 858-0646-6365", "Ngoro-Jombang")
        )
        listTeman.add(
            MyFriend("Silsilia Putri Avita Sari", "Perempuan", "sisiliaputri20@gmail.com",
            "+62 823-3491-3215", "Ngoro-Jombang")
        )
        listTeman.add(
            MyFriend("Shinta Ella Fatmasari", "Perempuan", "shinta@gmail.com",
            "+62 857-5503-6551", "Ngoro-Jombang")
        )
    }
    private fun tampilTeman(){
        rv_myfriendslist.layoutManager=LinearLayoutManager(activity)
        rv_myfriendslist.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }
}