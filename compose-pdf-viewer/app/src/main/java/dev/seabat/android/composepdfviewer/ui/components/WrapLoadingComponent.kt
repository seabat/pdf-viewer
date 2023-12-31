package dev.seabat.android.composepdfviewer.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WrapLoadingComponent() {
    Box(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
    }
}

@Preview
@Composable
fun PreviewLSmallLoadingComponent() {
    WrapLoadingComponent()
}