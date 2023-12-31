package dev.seabat.android.composepdfviewer.domain.repository

import dev.seabat.android.composepdfviewer.domain.entity.PdfEntity
import dev.seabat.android.composepdfviewer.domain.entity.PdfListEntity

interface FavoriteListRepositoryContract {
    suspend fun fetch(): PdfListEntity

    suspend fun add(pdf: PdfEntity)

    suspend fun update(pdf: PdfEntity)

    suspend fun remove(pdf: PdfEntity)
}