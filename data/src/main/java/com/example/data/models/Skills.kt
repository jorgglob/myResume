package com.example.data.models

import com.google.gson.annotations.SerializedName

data class Skills (
	@SerializedName("name")
	val name : String?,
	@SerializedName("level")
	val level : String?,
	@SerializedName("keywords")
	val keywords : List<String>?,
	@SerializedName("urlImage")
	val urlImage : String?
)