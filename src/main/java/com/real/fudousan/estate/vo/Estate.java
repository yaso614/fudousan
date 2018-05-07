package com.real.fudousan.estate.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.real.fudousan.entry.vo.Entry;
import com.real.fudousan.favorite.vo.Favorite;
import com.real.fudousan.reply.vo.Reply;
import com.real.fudousan.room.vo.Room;

/**
 * 매물 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Estate implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ESTATE_ID. */
	private Integer estateId;
	/** estateName. */
	private String estateName;

	/** 거래 유형. */
	private TransType transType;

	/** 地区. */
	private String region;

	/** 도시. */
	private MunicipalityCode municipalitycode;

	/** 都道府県名(도시 이름명). */
	private String prefecture;

	/** 市区町村名. */
	private String municipality;

	/** 地区名. */
	private String districtname;

	/** 最寄駅：名称. */
	private String neareststation;

	/** 最寄駅：距離（分）. */
	private Integer timetoneareststation;

	/** 取引価格（総額）. */
	private Integer tradeprice;

	/** 坪単価. */
	private Integer priceperunit;

	/** 間取り. */
	private String floorplan;

	/** 面積（平方メートル）. */
	private Integer area;

	/** 取引価格（平方メートル単価）. */
	private Integer unitprice;

	/** 土地の形状. */
	private String landshape;

	/** 間口.--- */
	private Double frontage;

	/** 延床面積(平方メートル).-- */
	private Integer totalfloorarea;

	/** 建築年. */
	private String buildingyear;

	/** 建物の構造. */
	private String structure;

	/** 用途. */
	private String use;

	/** 今後の利用目的. */
	private String purpose;

	/** 前面道路：方位. */
	private String direction;

	/** 前面道路：種類. */
	private String classification;

	/** 前面道路：幅員（ｍ）. */
	private Double breadth;

	/** 都市計画. */
	private String cityplanning;

	/** 建ぺい率（％）. */
	private Integer coverageratio;

	/** 容積率（％）. */
	private Integer floorarearatio;

	/** 取引時点. */
	private String period;

	/** 改装. */
	private String renovation;

	/** 取引の事情等. */
	private String remarks;

	/** DEL_DATE. */
	private Date delDate;
	
	private Date creDate;
	

	private String address;
	
	private double estateX;
	private double estateY;
	
	private Integer baseRoomId;


	public Estate() {
		super();
	}


	public Estate(Integer estateId, String estateName, TransType transType, String region,
			MunicipalityCode municipalitycode, String prefecture, String municipality, String districtname,
			String neareststation, Integer timetoneareststation, Integer tradeprice, Integer priceperunit,
			String floorplan, Integer area, Integer unitprice, String landshape, Double frontage,
			Integer totalfloorarea, String buildingyear, String structure, String use, String purpose, String direction,
			String classification, Double breadth, String cityplanning, Integer coverageratio, Integer floorarearatio,
			String period, String renovation, String remarks, Date delDate, Date creDate, String address,
			double estateX, double estateY, Integer baseRoomId) {
		super();
		this.estateId = estateId;
		this.estateName = estateName;
		this.transType = transType;
		this.region = region;
		this.municipalitycode = municipalitycode;
		this.prefecture = prefecture;
		this.municipality = municipality;
		this.districtname = districtname;
		this.neareststation = neareststation;
		this.timetoneareststation = timetoneareststation;
		this.tradeprice = tradeprice;
		this.priceperunit = priceperunit;
		this.floorplan = floorplan;
		this.area = area;
		this.unitprice = unitprice;
		this.landshape = landshape;
		this.frontage = frontage;
		this.totalfloorarea = totalfloorarea;
		this.buildingyear = buildingyear;
		this.structure = structure;
		this.use = use;
		this.purpose = purpose;
		this.direction = direction;
		this.classification = classification;
		this.breadth = breadth;
		this.cityplanning = cityplanning;
		this.coverageratio = coverageratio;
		this.floorarearatio = floorarearatio;
		this.period = period;
		this.renovation = renovation;
		this.remarks = remarks;
		this.delDate = delDate;
		this.creDate = creDate;
		this.address = address;
		this.estateX = estateX;
		this.estateY = estateY;
		this.baseRoomId = baseRoomId;
	}



	public Integer getEstateId() {
		return estateId;
	}


	public void setEstateId(Integer estateId) {
		this.estateId = estateId;
	}


	public TransType getTransType() {
		return transType;
	}


	public void setTransType(TransType transType) {
		this.transType = transType;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public MunicipalityCode getMunicipalitycode() {
		return municipalitycode;
	}


	public void setMunicipalitycode(MunicipalityCode municipalitycode) {
		this.municipalitycode = municipalitycode;
	}


	public String getPrefecture() {
		return prefecture;
	}


	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}


	public String getMunicipality() {
		return municipality;
	}


	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}


	public String getDistrictname() {
		return districtname;
	}


	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}


	public String getNeareststation() {
		return neareststation;
	}


	public void setNeareststation(String neareststation) {
		this.neareststation = neareststation;
	}


	public Integer getTimetoneareststation() {
		return timetoneareststation;
	}


	public void setTimetoneareststation(Integer timetoneareststation) {
		this.timetoneareststation = timetoneareststation;
	}


	public Integer getTradeprice() {
		return tradeprice;
	}


	public void setTradeprice(Integer tradeprice) {
		this.tradeprice = tradeprice;
	}


	public Integer getPriceperunit() {
		return priceperunit;
	}


	public void setPriceperunit(Integer priceperunit) {
		this.priceperunit = priceperunit;
	}


	public String getFloorplan() {
		return floorplan;
	}


	public void setFloorplan(String floorplan) {
		this.floorplan = floorplan;
	}


	public Integer getArea() {
		return area;
	}


	public void setArea(Integer area) {
		this.area = area;
	}


	public Integer getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}


	public String getLandshape() {
		return landshape;
	}


	public void setLandshape(String landshape) {
		this.landshape = landshape;
	}


	public Double getFrontage() {
		return frontage;
	}


	public void setFrontage(Double frontage) {
		this.frontage = frontage;
	}


	public Integer getTotalfloorarea() {
		return totalfloorarea;
	}


	public void setTotalfloorarea(Integer totalfloorarea) {
		this.totalfloorarea = totalfloorarea;
	}


	public String getBuildingyear() {
		return buildingyear;
	}


	public void setBuildingyear(String buildingyear) {
		this.buildingyear = buildingyear;
	}


	public String getStructure() {
		return structure;
	}


	public void setStructure(String structure) {
		this.structure = structure;
	}


	public String getUse() {
		return use;
	}


	public void setUse(String use) {
		this.use = use;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public Double getBreadth() {
		return breadth;
	}


	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}


	public String getCityplanning() {
		return cityplanning;
	}


	public void setCityplanning(String cityplanning) {
		this.cityplanning = cityplanning;
	}


	public Integer getCoverageratio() {
		return coverageratio;
	}


	public void setCoverageratio(Integer coverageratio) {
		this.coverageratio = coverageratio;
	}


	public Integer getFloorarearatio() {
		return floorarearatio;
	}


	public void setFloorarearatio(Integer floorarearatio) {
		this.floorarearatio = floorarearatio;
	}


	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}


	public String getRenovation() {
		return renovation;
	}


	public void setRenovation(String renovation) {
		this.renovation = renovation;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public Date getDelDate() {
		return delDate;
	}


	public void setDelDate(Date delDate) {
		this.delDate = delDate;
	}


	public String getEstateName() {
		return estateName;
	}


	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


	public double getEstateX() {
		return estateX;
	}



	public void setEstateX(double estateX) {
		this.estateX = estateX;
	}



	public double getEstateY() {
		return estateY;
	}



	public void setEstateY(double estateY) {
		this.estateY = estateY;
	}



	public Integer getBaseRoomId() {
		return baseRoomId;
	}






	public void setBaseRoomId(Integer baseRoomId) {
		this.baseRoomId = baseRoomId;
	}






	public Date getCreDate() {
		return creDate;
	}


	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}













	@Override
	public String toString() {
		return "Estate [estateId=" + estateId + ", estateName=" + estateName + ", transType=" + transType + ", region="
				+ region + ", municipalitycode=" + municipalitycode + ", prefecture=" + prefecture + ", municipality="
				+ municipality + ", districtname=" + districtname + ", neareststation=" + neareststation
				+ ", timetoneareststation=" + timetoneareststation + ", tradeprice=" + tradeprice + ", priceperunit="
				+ priceperunit + ", floorplan=" + floorplan + ", area=" + area + ", unitprice=" + unitprice
				+ ", landshape=" + landshape + ", frontage=" + frontage + ", totalfloorarea=" + totalfloorarea
				+ ", buildingyear=" + buildingyear + ", structure=" + structure + ", use=" + use + ", purpose="
				+ purpose + ", direction=" + direction + ", classification=" + classification + ", breadth=" + breadth
				+ ", cityplanning=" + cityplanning + ", coverageratio=" + coverageratio + ", floorarearatio="
				+ floorarearatio + ", period=" + period + ", renovation=" + renovation + ", remarks=" + remarks
				+ ", delDate=" + delDate + ", creDate=" + creDate + ", address=" + address + ", estateX=" + estateX
				+ ", estateY=" + estateY + ", baseRoomId=" + baseRoomId + "]";
	}













	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estateId == null) ? 0 : estateId.hashCode());
		return result;
	}













	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estate other = (Estate) obj;
		if (estateId == null) {
			if (other.estateId != null)
				return false;
		} else if (!estateId.equals(other.estateId))
			return false;
		return true;
	}

	
}