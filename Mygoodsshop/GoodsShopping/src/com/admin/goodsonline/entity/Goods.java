package com.admin.goodsonline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="goods")
public class Goods {
	private int goodsId;
	private String goodsName;
	private String goodsDescript;
	private int goodsPrice;
	private String goodsImagePath;
	private int sellCount;
	private GoodsType goodsType;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDescript() {
		return goodsDescript;
	}
	public void setGoodsDescript(String goodsDescript) {
		this.goodsDescript = goodsDescript;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsImagePath() {
		return goodsImagePath;
	}
	public void setGoodsImagePath(String goodsImagePath) {
		this.goodsImagePath = goodsImagePath;
	}
	public int getSellCount() {
		return sellCount;
	}
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	@ManyToOne
	@JoinColumn(name="goodsTypeId")
	public GoodsType getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

}
