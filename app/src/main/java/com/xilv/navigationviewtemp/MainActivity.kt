package com.xilv.navigationviewtemp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.xilv.navigationviewtemp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            /*
            присваиваем слушатели нажатий на кнопки в NavigationView
             */
            navigationView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    // Accounts
                    R.id.username1 -> Toast.makeText(this@MainActivity,
                        "You're logged in as User Name",
                        Toast.LENGTH_SHORT).show()
                    R.id.username2 -> Toast.makeText(this@MainActivity,
                        "You're logged in as Cat Name",
                        Toast.LENGTH_SHORT).show()
                    R.id.addAccount -> Toast.makeText(this@MainActivity,
                        "Add Account",
                        Toast.LENGTH_SHORT).show()

                    // Parameters
                    R.id.newGroupNv -> Toast.makeText(this@MainActivity,
                        "New Group",
                        Toast.LENGTH_SHORT).show()
                    R.id.contactsNv -> Toast.makeText(this@MainActivity,
                    "Contacts", Toast.LENGTH_SHORT).show()
                    R.id.callsNv -> Toast.makeText(this@MainActivity,
                    "Calls", Toast.LENGTH_SHORT).show()
                    R.id.settingsNv -> Toast.makeText(this@MainActivity,
                    "Settings", Toast.LENGTH_SHORT).show()

                    // Other
                    R.id.inviteFriendsNv -> Toast.makeText(this@MainActivity,
                    "Invite Friends", Toast.LENGTH_SHORT).show()
                    R.id.nothingAppFeaturesNv -> Toast.makeText(this@MainActivity,
                    "Nothing App Features", Toast.LENGTH_SHORT).show()
                }

                /*
                после нажатия на одну из кнопок,
                Navigation View закрывается с помощью команды ниже
                 */
                drawer.close()

                true
            }

            // слушатель нажатий для buttonOpen
            buttonOpen.setOnClickListener {
                // в данном случае, button октрывает Navigation View
                drawer.open()
            }
        }
    }
}