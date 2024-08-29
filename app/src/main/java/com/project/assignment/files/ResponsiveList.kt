package com.project.assignment.files

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true,
    showBackground = true)
@Composable
fun LazyColumnFunctioon() {
    LazyColumn(modifier = Modifier.padding(all = 20.dp)) {
        item {
            Text(
                text = "Contact List",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Shanza Gulab",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "shnzy60@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Laiba Aosaf",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "laibaaosaf@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Nimra Arshad",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "manimra840@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Sana Javaid",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "sanajavaid5223@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Msaab Ejaz",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "onlymasab@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Khadija Malik",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "khadijamalik253@gmail.com", fontSize = 18.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Memoona bibi",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "memoonabibi794@gmail.com", fontSize = 19.sp)
                    Text(
                        text = "+923145678910", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Nimra Shahid",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "nimrashahid853@gmail.com", fontSize = 22.sp)
                    Text(
                        text = "+923145678910", fontSize = 17.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))


            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Warisha Tayyab",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )
                    Text(text = "warishatayyab00@gmail.com", fontSize = 22.sp)
                    Text(
                        text = "+923145678910", fontSize = 17.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

        }
    }
}