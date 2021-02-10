package com.example.cryptoapp.pojo


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo(

    @SerializedName("TYPE")
    @Expose
    val TYPE: String? = null,

    @SerializedName("MARKET")
    @Expose
    val MARKET: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val FROMSYMBOL: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val TOSYMBOL: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val FLAGS: String? = null,

    @SerializedName("PRICE")
    @Expose
    val PRICE: Double = 0.0,

    @SerializedName("LASTUPDATE")
    @Expose
    val LASTUPDATE: Int = 0,

    @SerializedName("LASTVOLUME")
    @Expose
    val LASTVOLUME: Double = 0.0,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val LASTVOLUMETO: Double = 0.0,

    @SerializedName("LASTTRADEID")
    @Expose
    val LASTTRADEID: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val VOLUMEDAY: Double = 0.0,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val VOLUMEDAYTO: Double = 0.0,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val VOLUME24HOUR: Double = 0.0,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val VOLUME24HOURTO: Double = 0.0,

    @SerializedName("OPENDAY")
    @Expose
    val OPENDAY: Double = 0.0,

    @SerializedName("HIGHDAY")
    @Expose
    val HIGHDAY: Double = 0.0,

    @SerializedName("LOWDAY")
    @Expose
    val LOWDAY: Double = 0.0,

    @SerializedName("OPEN24HOUR")
    @Expose
    val OPEN24HOUR: Double = 0.0,

    @SerializedName("HIGH24HOUR")
    @Expose
    val HIGH24HOUR: Double = 0.0,

    @SerializedName("LOW24HOUR")
    @Expose
    val LOW24HOUR: Double = 0.0,

    @SerializedName("LASTMARKET")
    @Expose
    val LASTMARKET: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val VOLUMEHOUR: Double = 0.0,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val VOLUMEHOURTO: Double = 0.0,

    @SerializedName("OPENHOUR")
    @Expose
    val OPENHOUR: Double = 0.0,

    @SerializedName("HIGHHOUR")
    @Expose
    val HIGHHOUR: Double = 0.0,

    @SerializedName("LOWHOUR")
    @Expose
    val LOWHOUR: Double = 0.0,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val TOPTIERVOLUME24HOUR: Double = 0.0,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val TOPTIERVOLUME24HOURTO: Double = 0.0,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val CHANGE24HOUR: Double = 0.0,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val CHANGEPCT24HOUR: Double = 0.0,

    @SerializedName("CHANGEDAY")
    @Expose
    val CHANGEDAY: Double = 0.0,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val CHANGEPCTDAY: Double = 0.0,


    @SerializedName("SUPPLY")
    @Expose
    val CUPPLY: Int = 0,

    @SerializedName("MKTCAP")
    @Expose
    val MKTCAP: Double = 0.0,


    @SerializedName("TOTALVOLUME24H")
    @Expose
    val TOTALVOLUME24H: Double = 0.0,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val TOTALVOLUME24HTO: Double = 0.0,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val TOTALTOPTIERVOLUME24H: Double = 0.0,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val TOTALTOPTIERVOLUME24HTO: Double = 0.0,

    @SerializedName("IMAGEURL")
    @Expose
    val IMAGEURL: String? = null
)
