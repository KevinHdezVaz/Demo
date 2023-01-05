package com.example.movie.core

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.InetSocketAddress
import java.net.Socket

object InternetCheck
{


    suspend fun isNetworkAvailable() = coroutineScope {
        return@coroutineScope try {

        val sock  = Socket()
            val socketAdrres = InetSocketAddress("8.8.8.8", 53)
            withContext(Dispatchers.IO) {
                sock.connect(socketAdrres, 2000)
                sock.close()

            }
            true
        }catch(e: IOException){
            false
        }
    }
}