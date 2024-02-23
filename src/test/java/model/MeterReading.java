package model;

import java.math.BigDecimal;

public class MeterReading {

    //----------ATTRIBUTES-----------
    private Character contractNumber;
    private String address;
    private Long counterNumber;
    private BigDecimal oldMeterReading;
    private BigDecimal newMeterReading;

    //-----------GETTER/SETTER----------

    public Character getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Character contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCounterNumber() {
        return counterNumber;
    }

    public void setCounterNumber(Long counterNumber) {
        this.counterNumber = counterNumber;
    }

    public BigDecimal getOldMeterReading() {
        return oldMeterReading;
    }

    public void setOldMeterReading(BigDecimal oldMeterReading) {
        this.oldMeterReading = oldMeterReading;
    }

    public BigDecimal getNewMeterReading() {
        return newMeterReading;
    }

    public void setNewMeterReading(BigDecimal newMeterReading) {
        this.newMeterReading = newMeterReading;
    }
}
