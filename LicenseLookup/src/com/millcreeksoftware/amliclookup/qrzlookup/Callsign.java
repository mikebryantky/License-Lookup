package com.millcreeksoftware.amliclookup.qrzlookup;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Mike Bryant
 */
@Root(name="Callsign", strict=false)
public class Callsign {
    @Element(name = "call", required = false)
    private String call;

    @Element(name = "aliases", required = false)
    private String aliases;
    
    @Element(name = "dxcc", required = false)
    private String dxcc;

    @Element(name = "fname", required = false)
    private String fname;

    @Element(name = "name", required = false)
    private String name;

    @Element(name = "addr1", required = false)
    private String addr1;

    @Element(name = "addr2", required = false)
    private String addr2;

    @Element(name = "state", required = false)
    private String state;

    @Element(name = "zip", required = false)
    private String zip;

    @Element(name = "country", required = false)
    private String country;

    @Element(name = "ccode", required = false)
    private String ccode;

    @Element(name = "lat", required = false)
    private String lat;

    @Element(name = "lon", required = false)
    private String lon;

    @Element(name = "grid", required = false)
    private String grid;

    @Element(name = "county", required = false)
    private String county;

    @Element(name = "fips", required = false)
    private String fips;

    @Element(name = "land", required = false)
    private String land;

    @Element(name = "efdate", required = false)
    private String efDate;

    @Element(name = "expdate", required = false)
    private String expDate;

    @Element(name = "p_call", required = false)
    private String p_call;

    @Element(name = "class", required = false)
    private String operClass;

    @Element(name = "codes", required = false)
    private String codes;

    @Element(name = "qslmgr", required = false)
    private String qslMgr;

    @Element(name = "email", required = false)
    private String email;

    @Element(name = "url", required = false)
    private String url;

    @Element(name = "u_views", required = false)
    private String uViews;

    @Element(name = "bio", required = false)
    private String bio;

    @Element(name = "biodate", required = false)
    private String bioDate;
    
    @Element(name = "image", required = false)
    private String image;
    
    @Element(name = "imageinfo", required = false)
    private String imageInfo;

    @Element(name = "serial", required = false)
    private String serial;

    @Element(name = "moddate", required = false)
    private String modDate;

    @Element(name = "MSA", required = false)
    private String msa;

    @Element(name = "AreaCode", required = false)
    private String areaCode;

    @Element(name = "TimeZone", required = false)
    private String timeZone;

    @Element(name = "GMTOffset", required = false)
    private String gmtOffset;

    @Element(name = "DST", required = false)
    private String dst;

    @Element(name = "eqsl", required = false)
    private String eqsl;

    @Element(name = "mqsl", required = false)
    private String mqsl;

    @Element(name = "cqzone", required = false)
    private String cqZone;

    @Element(name = "ituzone", required = false)
    private String ituZone;

    @Element(name = "geoloc", required = false)
    private String geoLoc;

    @Element(name = "born", required = false)
    private String born;
    
    @Element(name = "lotw", required = false)
    private String lotw;
    
    @Element(name = "user", required = false)
    private String user;
    

    /**
     * @return the call
     */
    public String getCall() {
        return this.call;
    }

    /**
     * @param call
     *            the call to set
     */
    public void setCall(String call) {
        this.call = call;
    }

    /**
     * @return the dxcc
     */
    public String getDxcc() {
        return this.dxcc;
    }

    /**
     * @param dxcc
     *            the dxcc to set
     */
    public void setDxcc(String dxcc) {
        this.dxcc = dxcc;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return this.fname;
    }

    /**
     * @param fname
     *            the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @param timeZone
     *            the timeZone to set
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return the addr1
     */
    public String getAddr1() {
        return this.addr1;
    }

    /**
     * @param addr1
     *            the addr1 to set
     */
    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    /**
     * @return the addr2
     */
    public String getAddr2() {
        return this.addr2;
    }

    /**
     * @param addr2
     *            the addr2 to set
     */
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    /**
     * @return the state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return this.zip;
    }

    /**
     * @param zip
     *            the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the ccode
     */
    public String getCcode() {
        return this.ccode;
    }

    /**
     * @param ccode
     *            the ccode to set
     */
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    /**
     * @return the lat
     */
    public String getLat() {
        return this.lat;
    }

    /**
     * @param lat
     *            the lat to set
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public String getLon() {
        return this.lon;
    }

    /**
     * @param lon
     *            the lon to set
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * @return the grid
     */
    public String getGrid() {
        return this.grid;
    }

    /**
     * @param grid
     *            the grid to set
     */
    public void setGrid(String grid) {
        this.grid = grid;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * @param county
     *            the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the fips
     */
    public String getFips() {
        return this.fips;
    }

    /**
     * @param fips
     *            the fips to set
     */
    public void setFips(String fips) {
        this.fips = fips;
    }

    /**
     * @return the land
     */
    public String getLand() {
        return this.land;
    }

    /**
     * @param land
     *            the land to set
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * @return the efDate
     */
    public String getEfDate() {
        return this.efDate;
    }

    /**
     * @param efDate
     *            the efDate to set
     */
    public void setEfDate(String efDate) {
        this.efDate = efDate;
    }

    /**
     * @return the expDate
     */
    public String getExpDate() {
        return this.expDate;
    }

    /**
     * @param expDate
     *            the expDate to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }


    /**
     * @return the operClass
     */
    public String getOperClass() {
        return this.operClass;
    }

    /**
     * @param operClass
     *            the operClass to set
     */
    public void setOperClass(String operClass) {
        this.operClass = operClass;
    }

    /**
     * @return the codes
     */
    public String getCodes() {
        return this.codes;
    }

    /**
     * @param codes
     *            the codes to set
     */
    public void setCodes(String codes) {
        this.codes = codes;
    }

    /**
     * @return the qslMgr
     */
    public String getQslMgr() {
        return this.qslMgr;
    }

    /**
     * @param qslMgr
     *            the qslMgr to set
     */
    public void setQslMgr(String qslMgr) {
        this.qslMgr = qslMgr;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the uViews
     */
    public String getuViews() {
        return this.uViews;
    }

    /**
     * @param uViews
     *            the uViews to set
     */
    public void setuViews(String uViews) {
        this.uViews = uViews;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * @param bio
     *            the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @param image
     *            the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return this.serial;
    }

    /**
     * @param serial
     *            the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the modDate
     */
    public String getModDate() {
        return this.modDate;
    }

    /**
     * @param modDate
     *            the modDate to set
     */
    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    /**
     * @return the msa
     */
    public String getMsa() {
        return this.msa;
    }

    /**
     * @param msa
     *            the msa to set
     */
    public void setMsa(String msa) {
        this.msa = msa;
    }

    /**
     * @return the areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @param areaCode
     *            the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return the gmtOffset
     */
    public String getGmtOffset() {
        return this.gmtOffset;
    }

    /**
     * @param gmtOffset
     *            the gmtOffset to set
     */
    public void setGmtOffset(String gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    /**
     * @return the dst
     */
    public String getDst() {
        return this.dst;
    }

    /**
     * @param dst
     *            the dst to set
     */
    public void setDst(String dst) {
        this.dst = dst;
    }

    /**
     * @return the eqsl
     */
    public String getEqsl() {
        return this.eqsl;
    }

    /**
     * @param eqsl
     *            the eqsl to set
     */
    public void setEqsl(String eqsl) {
        this.eqsl = eqsl;
    }

    /**
     * @return the mqsl
     */
    public String getMqsl() {
        return this.mqsl;
    }

    /**
     * @param mqsl
     *            the mqsl to set
     */
    public void setMqsl(String mqsl) {
        this.mqsl = mqsl;
    }

    /**
     * @return the cqZone
     */
    public String getCqzone() {
        return this.cqZone;
    }

    /**
     * @return the ituZone
     */
    public String getItuZone() {
        return this.ituZone;
    }

    /**
     * @param ituZone
     *            the ituZone to set
     */
    public void setItuZone(String ituZone) {
        this.ituZone = ituZone;
    }

    /**
     * @return the geoLoc
     */
    public String getGeoLoc() {
        return this.geoLoc;
    }

    /**
     * @param geoLoc
     *            the geoLoc to set
     */
    public void setGeoLoc(String geoLoc) {
        this.geoLoc = geoLoc;
    }

    /**
     * @return the born
     */
    public String getBorn() {
        return this.born;
    }

    /**
     * @param born
     *            the born to set
     */
    public void setBorn(String born) {
        this.born = born;
    }

    /**
     * @return the bioDate
     */
    public String getBioDate() {
        return this.bioDate;
    }

    /**
     * @param bioDate the bioDate to set
     */
    public void setBioDate(String bioDate) {
        this.bioDate = bioDate;
    }

    /**
     * @return the cqZone
     */
    public String getCqZone() {
        return this.cqZone;
    }

    /**
     * @param cqZone the cqZone to set
     */
    public void setCqZone(String cqZone) {
        this.cqZone = cqZone;
    }

    /**
     * @return the imageInfo
     */
    public String getImageInfo() {
        return this.imageInfo;
    }

    /**
     * @param imageInfo the imageInfo to set
     */
    public void setImageInfo(String imageInfo) {
        this.imageInfo = imageInfo;
    }

    /**
     * @return the lotw
     */
    public String getLotw() {
        return this.lotw;
    }

    /**
     * @param lotw the lotw to set
     */
    public void setLotw(String lotw) {
        this.lotw = lotw;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the p_call
     */
    public String getP_call() {
        return this.p_call;
    }

    /**
     * @param p_call the p_call to set
     */
    public void setP_call(String p_call) {
        this.p_call = p_call;
    }

    /* 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Callsign [call=").append(this.call).append(", dxcc=").append(this.dxcc).append(", fname=")
                .append(this.fname).append(", name=").append(this.name).append(", addr1=").append(this.addr1)
                .append(", addr2=").append(this.addr2).append(", state=").append(this.state).append(", zip=")
                .append(this.zip).append(", country=").append(this.country).append(", ccode=").append(this.ccode)
                .append(", lat=").append(this.lat).append(", lon=").append(this.lon).append(", grid=")
                .append(this.grid).append(", county=").append(this.county).append(", fips=").append(this.fips)
                .append(", land=").append(this.land).append(", efDate=").append(this.efDate).append(", expDate=")
                .append(this.expDate).append(", p_call=").append(this.p_call).append(", operClass=")
                .append(this.operClass).append(", codes=").append(this.codes).append(", qslMgr=").append(this.qslMgr)
                .append(", email=").append(this.email).append(", url=").append(this.url).append(", uViews=")
                .append(this.uViews).append(", bio=").append(this.bio).append(", bioDate=").append(this.bioDate)
                .append(", image=").append(this.image).append(", imageInfo=").append(this.imageInfo)
                .append(", serial=").append(this.serial).append(", modDate=").append(this.modDate).append(", msa=")
                .append(this.msa).append(", areaCode=").append(this.areaCode).append(", timeZone=")
                .append(this.timeZone).append(", gmtOffset=").append(this.gmtOffset).append(", dst=").append(this.dst)
                .append(", eqsl=").append(this.eqsl).append(", mqsl=").append(this.mqsl).append(", cqZone=")
                .append(this.cqZone).append(", ituZone=").append(this.ituZone).append(", geoLoc=").append(this.geoLoc)
                .append(", born=").append(this.born).append(", lotw=").append(this.lotw).append(", user=")
                .append(this.user).append("]");
        return builder.toString();
    }

    /**
     * @return the aliases
     */
    public String getAliases() {
        return this.aliases;
    }

    /**
     * @param aliases the aliases to set
     */
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }
    
}
