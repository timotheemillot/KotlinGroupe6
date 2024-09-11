package com.example.data
import com.google.gson.annotations.SerializedName

data class getRessourceDto(
    val info: PagerInfo,
    val data: List<RessourceDto>
)

data class PagerInfo(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)

data class RessourceDto(

    @SerializedName("ressourceId")
    val ressrouceId : Int,

    @SerializedName("nom")
    val nom : String,

    @SerializedName("capacite")
    val capacite : Int,

    @SerializedName("siteId")
    val siteId : Int,

    @SerializedName("typeId")
    val typeId : Int,
)
