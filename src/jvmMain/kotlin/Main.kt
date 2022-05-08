// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

@Composable
@Preview
fun MonkeyApp() {
    MaterialTheme {
        Text(
            text = "Hello theming",
            color = MaterialTheme.colors.primary
        )
    }
}

fun main() = application {
    Window(
        title = "稳定性测试", // 设置窗口标题
        icon = painterResource("logo.svg"), // 设置Logo
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(
            position = WindowPosition(alignment = Center) // 设置窗口位置
        )
    ) {
        MonkeyApp()
    }
}
