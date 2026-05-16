package com.example.jetareader

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetareader.navigation.ReaderNavigation
import com.example.jetareader.ui.theme.JetAReaderTheme
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // adding the user to the firebase everytime we run the app

//        val db = FirebaseFirestore.getInstance()
//        val user: MutableMap<String, Any> = HashMap()
//        user["firstName"] = "Mohit"
//        user["lastName"] = "Jangra"
//        user["Age"] = "20"
//        user["Gender"] = "Male"
//        user["Branch"] = "CSE"
//        db.collection("users")
//            .add(user)
//            .addOnSuccessListener {
//                Log.d("FB", "onCreate:${it.id}")
//            }.addOnFailureListener {
//                Log.d("FB", "onCreate:$it")
//            }

        enableEdgeToEdge()
        setContent {
            JetAReaderTheme {
                ReaderApp()
            }
        }
    }
}

@Composable
fun ReaderApp() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ReaderNavigation()
            }
        }
    )
}

