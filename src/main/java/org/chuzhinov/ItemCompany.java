package org.chuzhinov;

import org.chuzhinov.enums.COMPANYSIZE;
import org.chuzhinov.enums.COMPANYTYPE;
import org.chuzhinov.enums.SAN;

import javax.validation.constraints.Min;

public class ItemCompany {
    @Min(1)
    private int countPeople;
    private COMPANYTYPE companytype;//разработка по, продажа оборудования, предоставление услуг, сеть общественного питания
    @Min(1)
    private int budget; //бюджет компании

    private SAN san;//сеть хранения данных   если lan==c2s  и companyType==продажа оборудования, предоставление услуг , то облако
    private COMPANYSIZE companysize;//~countPeople
    private int countComp;
    private int memorySizeForSan;//~internetTraffic, countComp
    private int RAM;//~companyType
    private int internetTraffic;//~ countPeople и COMPANYTYPE
    private int countPrinters;// ~ COMPANYTYPE ,countPeople
    private boolean haveErpSystem;//COMPANYSIZE , budget
    private boolean havePabx; //наличие автоматической телефонной станции ~ COMPANYTYPE, budget
    private boolean haveSite;// ~ COMPANYTYPE или countPeople > 100 , budget

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public COMPANYTYPE getCompanytype() {
        return companytype;
    }

    public void setCompanytype(COMPANYTYPE companytype) {
        this.companytype = companytype;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public SAN getSan() {
        return san;
    }

    public void setSan(SAN san) {
        this.san = san;
    }

    public COMPANYSIZE getCompanysize() {
        return companysize;
    }

    public void setCompanysize(COMPANYSIZE companysize) {
        this.companysize = companysize;
    }

    public int getCountComp() {
        return countComp;
    }

    public void setCountComp(int countComp) {
        this.countComp = countComp;
    }

    public int getMemorySizeForSan() {
        return memorySizeForSan;
    }

    public void setMemorySizeForSan(int memorySizeForSan) {
        this.memorySizeForSan = memorySizeForSan;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getCountPrinters() {
        return countPrinters;
    }

    public void setCountPrinters(int countPrinters) {
        this.countPrinters = countPrinters;
    }

    public boolean isHaveErpSystem() {
        return haveErpSystem;
    }

    public void setHaveErpSystem(boolean haveErpSystem) {
        this.haveErpSystem = haveErpSystem;
    }

    public boolean isHavePabx() {
        return havePabx;
    }

    public void setHavePabx(boolean havePabx) {
        this.havePabx = havePabx;
    }

    public boolean isHaveSite() {
        return haveSite;
    }

    public void setHaveSite(boolean haveSite) {
        this.haveSite = haveSite;
    }


}
