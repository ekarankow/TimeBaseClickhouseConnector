package deltix.timebase.connector.clickhouse.timebase;


import com.epam.deltix.timebase.messages.*;
/**
 * This class may represent both exchange-local top of the book (BBO) as well as National Best Bid Offer (NBBO).
 * You can use method {link #isNBBO()} to filter out NBBO messages.
 */
@SchemaElement(
        name = "deltix.timebase.connector.clickhouse.timebase.BestBidOfferTestMessage",
        title = "Best Bid Offer Message"
)
public class BestBidOfferTestMessage extends InstrumentMessage {
    public static final String CLASS_NAME = BestBidOfferTestMessage.class.getName();

    /**
     * Tells whether this is an aggregated national quote.
     */
    protected byte isNational = TypeConstants.BOOLEAN_NULL;

    /**
     * If there are bids on the market, this is the best bid price.
     * If it is known that there are no bids on the market, bidPrice is set to NULL.
     * If this is a one-sided message with offer data only, bidPrice is set to NULL.
     */
    protected double bidPrice = TypeConstants.IEEE64_NULL;

    /**
     * If there are bids on the market, this is the best bid's size.
     * If it is known that there are no bids on the market, bidSize is set to 0.
     * If this is a one-sided message with offer data only, bidSize is set to NULL.
     */
    protected double bidSize = TypeConstants.IEEE64_NULL;

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with offer data only.
     */
    protected long bidExchangeId = TypeConstants.EXCHANGE_NULL;

    /**
     * Bid Number Of Orders.
     */
    protected int bidNumOfOrders = TypeConstants.INT32_NULL;

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     */
    protected CharSequence bidQuoteId = null;

    /**
     * If there are offers on the market, this is the best offer price.
     * If it is known that there are no offers on the market, offerPrice is set to NULL.
     * If this is a one-sided message with bid data only, offerPrice is set to NULL.
     */
    protected double offerPrice = TypeConstants.IEEE64_NULL;

    /**
     * If there are offers on the market, this is the best offer's size.
     * If it is known that there are no offers on the market, offerSize is set to 0.
     * If this is a one-sided message with bid data only, offerSize is set to NULL.
     */
    protected double offerSize = TypeConstants.IEEE64_NULL;

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with bid data only.
     */
    protected long offerExchangeId = TypeConstants.EXCHANGE_NULL;

    /**
     * Offer Number Of Orders
     */
    protected int offerNumOfOrders = TypeConstants.INT32_NULL;

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     */
    protected CharSequence offerQuoteId = null;

    /**
     * Market specific identifier of the given event in a sequence of market events.
     */
    protected long sequenceNumber = TypeConstants.INT64_NULL;

    /**
     * Tells whether this is an aggregated national quote.
     * @return Is National
     */
    @SchemaType(
            dataType = SchemaDataType.BOOLEAN
    )
    @SchemaElement
    public boolean isNational() {
        return isNational == 1;
    }

    /**
     * Tells whether this is an aggregated national quote.
     * @param value - Is National
     */
    public void setIsNational(boolean value) {
        this.isNational = (byte)(value ? 1 : 0);
    }

    /**
     * Tells whether this is an aggregated national quote.
     * @return true if Is National is not null
     */
    public boolean hasIsNational() {
        return isNational != TypeConstants.BOOLEAN_NULL;
    }

    /**
     * Tells whether this is an aggregated national quote.
     */
    public void nullifyIsNational() {
        this.isNational = TypeConstants.BOOLEAN_NULL;
    }

    /**
     * If there are bids on the market, this is the best bid price.
     * If it is known that there are no bids on the market, bidPrice is set to NULL.
     * If this is a one-sided message with offer data only, bidPrice is set to NULL.
     * @return Bid Price
     */
    @SchemaType(
            encoding = "DECIMAL(8)",
            dataType = SchemaDataType.FLOAT
    )
    @SchemaElement
    public double getBidPrice() {
        return bidPrice;
    }

    /**
     * If there are bids on the market, this is the best bid price.
     * If it is known that there are no bids on the market, bidPrice is set to NULL.
     * If this is a one-sided message with offer data only, bidPrice is set to NULL.
     * @param value - Bid Price
     */
    public void setBidPrice(double value) {
        this.bidPrice = value;
    }

    /**
     * If there are bids on the market, this is the best bid price.
     * If it is known that there are no bids on the market, bidPrice is set to NULL.
     * If this is a one-sided message with offer data only, bidPrice is set to NULL.
     * @return true if Bid Price is not null
     */
    public boolean hasBidPrice() {
        return !Double.isNaN(bidPrice);
    }

    /**
     * If there are bids on the market, this is the best bid price.
     * If it is known that there are no bids on the market, bidPrice is set to NULL.
     * If this is a one-sided message with offer data only, bidPrice is set to NULL.
     */
    public void nullifyBidPrice() {
        this.bidPrice = TypeConstants.IEEE64_NULL;
    }

    /**
     * If there are bids on the market, this is the best bid's size.
     * If it is known that there are no bids on the market, bidSize is set to 0.
     * If this is a one-sided message with offer data only, bidSize is set to NULL.
     * @return Bid Size
     */
    @SchemaType(
            encoding = "DECIMAL(8)",
            dataType = SchemaDataType.FLOAT
    )
    @SchemaElement
    public double getBidSize() {
        return bidSize;
    }

    /**
     * If there are bids on the market, this is the best bid's size.
     * If it is known that there are no bids on the market, bidSize is set to 0.
     * If this is a one-sided message with offer data only, bidSize is set to NULL.
     * @param value - Bid Size
     */
    public void setBidSize(double value) {
        this.bidSize = value;
    }

    /**
     * If there are bids on the market, this is the best bid's size.
     * If it is known that there are no bids on the market, bidSize is set to 0.
     * If this is a one-sided message with offer data only, bidSize is set to NULL.
     * @return true if Bid Size is not null
     */
    public boolean hasBidSize() {
        return !Double.isNaN(bidSize);
    }

    /**
     * If there are bids on the market, this is the best bid's size.
     * If it is known that there are no bids on the market, bidSize is set to 0.
     * If this is a one-sided message with offer data only, bidSize is set to NULL.
     */
    public void nullifyBidSize() {
        this.bidSize = TypeConstants.IEEE64_NULL;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with offer data only.
     * @return Bid Exchange Id
     */
    @SchemaType(
            encoding = "ALPHANUMERIC(10)",
            dataType = SchemaDataType.VARCHAR
    )
    @SchemaElement
    @OldElementName("bidExchange")
    public long getBidExchangeId() {
        return bidExchangeId;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with offer data only.
     * @param value - Bid Exchange Id
     */
    public void setBidExchangeId(long value) {
        this.bidExchangeId = value;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with offer data only.
     * @return true if Bid Exchange Id is not null
     */
    public boolean hasBidExchangeId() {
        return bidExchangeId != TypeConstants.INT64_NULL;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with offer data only.
     */
    public void nullifyBidExchangeId() {
        this.bidExchangeId = TypeConstants.INT64_NULL;
    }

    /**
     * Bid Number Of Orders.
     * @return Bid Num Of Orders
     */
    @SchemaType(
            encoding = "SIGNED(32)",
            dataType = SchemaDataType.INTEGER
    )
    @SchemaElement
    public int getBidNumOfOrders() {
        return bidNumOfOrders;
    }

    /**
     * Bid Number Of Orders.
     * @param value - Bid Num Of Orders
     */
    public void setBidNumOfOrders(int value) {
        this.bidNumOfOrders = value;
    }

    /**
     * Bid Number Of Orders.
     * @return true if Bid Num Of Orders is not null
     */
    public boolean hasBidNumOfOrders() {
        return bidNumOfOrders != TypeConstants.INT32_NULL;
    }

    /**
     * Bid Number Of Orders.
     */
    public void nullifyBidNumOfOrders() {
        this.bidNumOfOrders = TypeConstants.INT32_NULL;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @return Bid Quote Id
     */
    @Identifier
    @SchemaElement
    public CharSequence getBidQuoteId() {
        return bidQuoteId;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @param value - Bid Quote Id
     */
    public void setBidQuoteId(CharSequence value) {
        this.bidQuoteId = value;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @return true if Bid Quote Id is not null
     */
    public boolean hasBidQuoteId() {
        return bidQuoteId != null;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     */
    public void nullifyBidQuoteId() {
        this.bidQuoteId = null;
    }

    /**
     * If there are offers on the market, this is the best offer price.
     * If it is known that there are no offers on the market, offerPrice is set to NULL.
     * If this is a one-sided message with bid data only, offerPrice is set to NULL.
     * @return Offer Price
     */
    @SchemaType(
            encoding = "DECIMAL(8)",
            dataType = SchemaDataType.FLOAT
    )
    @SchemaElement
    public double getOfferPrice() {
        return offerPrice;
    }

    /**
     * If there are offers on the market, this is the best offer price.
     * If it is known that there are no offers on the market, offerPrice is set to NULL.
     * If this is a one-sided message with bid data only, offerPrice is set to NULL.
     * @param value - Offer Price
     */
    public void setOfferPrice(double value) {
        this.offerPrice = value;
    }

    /**
     * If there are offers on the market, this is the best offer price.
     * If it is known that there are no offers on the market, offerPrice is set to NULL.
     * If this is a one-sided message with bid data only, offerPrice is set to NULL.
     * @return true if Offer Price is not null
     */
    public boolean hasOfferPrice() {
        return !Double.isNaN(offerPrice);
    }

    /**
     * If there are offers on the market, this is the best offer price.
     * If it is known that there are no offers on the market, offerPrice is set to NULL.
     * If this is a one-sided message with bid data only, offerPrice is set to NULL.
     */
    public void nullifyOfferPrice() {
        this.offerPrice = TypeConstants.IEEE64_NULL;
    }

    /**
     * If there are offers on the market, this is the best offer's size.
     * If it is known that there are no offers on the market, offerSize is set to 0.
     * If this is a one-sided message with bid data only, offerSize is set to NULL.
     * @return Offer Size
     */
    @SchemaType(
            encoding = "DECIMAL(8)",
            dataType = SchemaDataType.FLOAT
    )
    @SchemaElement
    public double getOfferSize() {
        return offerSize;
    }

    /**
     * If there are offers on the market, this is the best offer's size.
     * If it is known that there are no offers on the market, offerSize is set to 0.
     * If this is a one-sided message with bid data only, offerSize is set to NULL.
     * @param value - Offer Size
     */
    public void setOfferSize(double value) {
        this.offerSize = value;
    }

    /**
     * If there are offers on the market, this is the best offer's size.
     * If it is known that there are no offers on the market, offerSize is set to 0.
     * If this is a one-sided message with bid data only, offerSize is set to NULL.
     * @return true if Offer Size is not null
     */
    public boolean hasOfferSize() {
        return !Double.isNaN(offerSize);
    }

    /**
     * If there are offers on the market, this is the best offer's size.
     * If it is known that there are no offers on the market, offerSize is set to 0.
     * If this is a one-sided message with bid data only, offerSize is set to NULL.
     */
    public void nullifyOfferSize() {
        this.offerSize = TypeConstants.IEEE64_NULL;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with bid data only.
     * @return Offer Exchange Id
     */
    @SchemaType(
            encoding = "ALPHANUMERIC(10)",
            dataType = SchemaDataType.VARCHAR
    )
    @SchemaElement
    @OldElementName("offerExchange")
    public long getOfferExchangeId() {
        return offerExchangeId;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with bid data only.
     * @param value - Offer Exchange Id
     */
    public void setOfferExchangeId(long value) {
        this.offerExchangeId = value;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with bid data only.
     * @return true if Offer Exchange Id is not null
     */
    public boolean hasOfferExchangeId() {
        return offerExchangeId != TypeConstants.INT64_NULL;
    }

    /**
     * Vendor-specific market code, or NULL if this is a one-sided message with bid data only.
     */
    public void nullifyOfferExchangeId() {
        this.offerExchangeId = TypeConstants.INT64_NULL;
    }

    /**
     * Offer Number Of Orders
     * @return Offer Num Of Orders
     */
    @SchemaType(
            encoding = "SIGNED(32)",
            dataType = SchemaDataType.INTEGER
    )
    @SchemaElement
    public int getOfferNumOfOrders() {
        return offerNumOfOrders;
    }

    /**
     * Offer Number Of Orders
     * @param value - Offer Num Of Orders
     */
    public void setOfferNumOfOrders(int value) {
        this.offerNumOfOrders = value;
    }

    /**
     * Offer Number Of Orders
     * @return true if Offer Num Of Orders is not null
     */
    public boolean hasOfferNumOfOrders() {
        return offerNumOfOrders != TypeConstants.INT32_NULL;
    }

    /**
     * Offer Number Of Orders
     */
    public void nullifyOfferNumOfOrders() {
        this.offerNumOfOrders = TypeConstants.INT32_NULL;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @return Offer Quote Id
     */
    @Identifier
    @SchemaElement
    public CharSequence getOfferQuoteId() {
        return offerQuoteId;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @param value - Offer Quote Id
     */
    public void setOfferQuoteId(CharSequence value) {
        this.offerQuoteId = value;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     * @return true if Offer Quote Id is not null
     */
    public boolean hasOfferQuoteId() {
        return offerQuoteId != null;
    }

    /**
     * In Forex market quote ID can be referenced in TradeOrders (to identify market maker's quote/rate we want to deal with).
     * Each market maker usually keeps this ID unique per session per day.
     * This is a alpha-numeric text text field that can reach 64 characters or more, depending on market maker.
     */
    public void nullifyOfferQuoteId() {
        this.offerQuoteId = null;
    }

    /**
     * Market specific identifier of the given event in a sequence of market events.
     * @return Sequence Number
     */
    @SchemaElement
    public long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Market specific identifier of the given event in a sequence of market events.
     * @param value - Sequence Number
     */
    public void setSequenceNumber(long value) {
        this.sequenceNumber = value;
    }

    /**
     * Market specific identifier of the given event in a sequence of market events.
     * @return true if Sequence Number is not null
     */
    public boolean hasSequenceNumber() {
        return sequenceNumber != TypeConstants.INT64_NULL;
    }

    /**
     * Market specific identifier of the given event in a sequence of market events.
     */
    public void nullifySequenceNumber() {
        this.sequenceNumber = TypeConstants.INT64_NULL;
    }

    /**
     * Creates new instance of this class.
     * @return new instance of this class.
     */
    @Override
    protected BestBidOfferTestMessage createInstance() {
        return new BestBidOfferTestMessage();
    }

    /**
     * Method nullifies all instance properties
     */
    @Override
    public BestBidOfferTestMessage nullify() {
        super.nullify();
        nullifyIsNational();
        nullifyBidPrice();
        nullifyBidSize();
        nullifyBidExchangeId();
        nullifyBidNumOfOrders();
        nullifyBidQuoteId();
        nullifyOfferPrice();
        nullifyOfferSize();
        nullifyOfferExchangeId();
        nullifyOfferNumOfOrders();
        nullifyOfferQuoteId();
        return this;
    }

    /**
     * Resets all instance properties to their default values
     */
    @Override
    public BestBidOfferTestMessage reset() {
        super.reset();
        isNational = TypeConstants.BOOLEAN_NULL;
        bidPrice = TypeConstants.IEEE64_NULL;
        bidSize = TypeConstants.IEEE64_NULL;
        bidExchangeId = TypeConstants.EXCHANGE_NULL;
        bidNumOfOrders = TypeConstants.INT32_NULL;
        bidQuoteId = null;
        offerPrice = TypeConstants.IEEE64_NULL;
        offerSize = TypeConstants.IEEE64_NULL;
        offerExchangeId = TypeConstants.EXCHANGE_NULL;
        offerNumOfOrders = TypeConstants.INT32_NULL;
        offerQuoteId = null;
        return this;
    }

    /**
     * Method copies state to a given instance
     */
    @Override
    public BestBidOfferTestMessage clone() {
        BestBidOfferTestMessage t = createInstance();
        t.copyFrom(this);
        return t;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        boolean superEquals = super.equals(obj);
        if (!superEquals) return false;
        if (!(obj instanceof BestBidOfferTestMessage)) return false;
        BestBidOfferTestMessage other =(BestBidOfferTestMessage)obj;
        if (hasIsNational() != other.hasIsNational()) return false;
        if (hasIsNational() && isNational() != other.isNational()) return false;
        if (hasBidPrice() != other.hasBidPrice()) return false;
        if (hasBidPrice() && getBidPrice() != other.getBidPrice()) return false;
        if (hasBidSize() != other.hasBidSize()) return false;
        if (hasBidSize() && getBidSize() != other.getBidSize()) return false;
        if (hasBidExchangeId() != other.hasBidExchangeId()) return false;
        if (hasBidExchangeId() && getBidExchangeId() != other.getBidExchangeId()) return false;
        if (hasBidNumOfOrders() != other.hasBidNumOfOrders()) return false;
        if (hasBidNumOfOrders() && getBidNumOfOrders() != other.getBidNumOfOrders()) return false;
        if (hasBidQuoteId() != other.hasBidQuoteId()) return false;
        if (hasBidQuoteId()) {
            if (getBidQuoteId().length() != other.getBidQuoteId().length()) return false; else {
                String s1 = getBidQuoteId().toString();
                String s2 = other.getBidQuoteId().toString();
                if (!s1.equals(s2)) return false;
            }
        }
        if (hasOfferPrice() != other.hasOfferPrice()) return false;
        if (hasOfferPrice() && getOfferPrice() != other.getOfferPrice()) return false;
        if (hasOfferSize() != other.hasOfferSize()) return false;
        if (hasOfferSize() && getOfferSize() != other.getOfferSize()) return false;
        if (hasOfferExchangeId() != other.hasOfferExchangeId()) return false;
        if (hasOfferExchangeId() && getOfferExchangeId() != other.getOfferExchangeId()) return false;
        if (hasOfferNumOfOrders() != other.hasOfferNumOfOrders()) return false;
        if (hasOfferNumOfOrders() && getOfferNumOfOrders() != other.getOfferNumOfOrders()) return false;
        if (hasOfferQuoteId() != other.hasOfferQuoteId()) return false;
        if (hasOfferQuoteId()) {
            if (getOfferQuoteId().length() != other.getOfferQuoteId().length()) return false; else {
                String s1 = getOfferQuoteId().toString();
                String s2 = other.getOfferQuoteId().toString();
                if (!s1.equals(s2)) return false;
            }
        }
        return true;
    }

    /**
     * Returns a hash code value for the object. This method is * supported for the benefit of hash tables such as those provided by.
     */
    @Override
    public int hashCode() {
        int hash = super.hashCode();
        if (hasIsNational()) {
            hash = hash * 31 + (isNational() ? 1231 : 1237);
        }
        if (hasBidPrice()) {
            hash = hash * 31 + ((int)(Double.doubleToLongBits(getBidPrice()) ^ (Double.doubleToLongBits(getBidPrice()) >>> 32)));
        }
        if (hasBidSize()) {
            hash = hash * 31 + ((int)(Double.doubleToLongBits(getBidSize()) ^ (Double.doubleToLongBits(getBidSize()) >>> 32)));
        }
        if (hasBidExchangeId()) {
            hash = hash * 31 + ((int)(getBidExchangeId() ^ (getBidExchangeId() >>> 32)));
        }
        if (hasBidNumOfOrders()) {
            hash = hash * 31 + (getBidNumOfOrders());
        }
        if (hasBidQuoteId()) {
            hash = hash * 31 + getBidQuoteId().hashCode();
        }
        if (hasOfferPrice()) {
            hash = hash * 31 + ((int)(Double.doubleToLongBits(getOfferPrice()) ^ (Double.doubleToLongBits(getOfferPrice()) >>> 32)));
        }
        if (hasOfferSize()) {
            hash = hash * 31 + ((int)(Double.doubleToLongBits(getOfferSize()) ^ (Double.doubleToLongBits(getOfferSize()) >>> 32)));
        }
        if (hasOfferExchangeId()) {
            hash = hash * 31 + ((int)(getOfferExchangeId() ^ (getOfferExchangeId() >>> 32)));
        }
        if (hasOfferNumOfOrders()) {
            hash = hash * 31 + (getOfferNumOfOrders());
        }
        if (hasOfferQuoteId()) {
            hash = hash * 31 + getOfferQuoteId().hashCode();
        }
        return hash;
    }

    /**
     * Method copies state to a given instance
     * @param template class instance that should be used as a copy source
     */
    @Override
    public BestBidOfferTestMessage copyFrom(RecordInfo template) {
        super.copyFrom(template);
        if (template instanceof BestBidOfferTestMessage) {
            BestBidOfferTestMessage t = (BestBidOfferTestMessage)template;
            if (t.hasIsNational()) {
                setIsNational(t.isNational());
            } else {
                nullifyIsNational();
            }
            if (t.hasBidPrice()) {
                setBidPrice(t.getBidPrice());
            } else {
                nullifyBidPrice();
            }
            if (t.hasBidSize()) {
                setBidSize(t.getBidSize());
            } else {
                nullifyBidSize();
            }
            if (t.hasBidExchangeId()) {
                setBidExchangeId(t.getBidExchangeId());
            } else {
                nullifyBidExchangeId();
            }
            if (t.hasBidNumOfOrders()) {
                setBidNumOfOrders(t.getBidNumOfOrders());
            } else {
                nullifyBidNumOfOrders();
            }
            if (t.hasBidQuoteId()) {
                setBidQuoteId(t.getBidQuoteId().toString());
            } else {
                nullifyBidQuoteId();
            }
            if (t.hasOfferPrice()) {
                setOfferPrice(t.getOfferPrice());
            } else {
                nullifyOfferPrice();
            }
            if (t.hasOfferSize()) {
                setOfferSize(t.getOfferSize());
            } else {
                nullifyOfferSize();
            }
            if (t.hasOfferExchangeId()) {
                setOfferExchangeId(t.getOfferExchangeId());
            } else {
                nullifyOfferExchangeId();
            }
            if (t.hasOfferNumOfOrders()) {
                setOfferNumOfOrders(t.getOfferNumOfOrders());
            } else {
                nullifyOfferNumOfOrders();
            }
            if (t.hasOfferQuoteId()) {
                setOfferQuoteId(t.getOfferQuoteId().toString());
            } else {
                nullifyOfferQuoteId();
            }
        }
        return this;
    }

    /**
     * @return a string representation of this class object.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        return toString(str).toString();
    }

    /**
     * @return a string representation of this class object.
     */
    @Override
    public StringBuilder toString(StringBuilder str) {
        str.append("{ \"$type\":  \"BestBidOfferMessage\"");
        if (hasIsNational()) {
            str.append(", \"isNational\": ").append(isNational());
        }
        if (hasBidPrice()) {
            str.append(", \"bidPrice\": ").append(getBidPrice());
        }
        if (hasBidSize()) {
            str.append(", \"bidSize\": ").append(getBidSize());
        }
        if (hasBidExchangeId()) {
            str.append(", \"bidExchangeId\": ").append(getBidExchangeId());
        }
        if (hasBidNumOfOrders()) {
            str.append(", \"bidNumOfOrders\": ").append(getBidNumOfOrders());
        }
        if (hasBidQuoteId()) {
            str.append(", \"bidQuoteId\": \"").append(getBidQuoteId()).append("\"");
        }
        if (hasOfferPrice()) {
            str.append(", \"offerPrice\": ").append(getOfferPrice());
        }
        if (hasOfferSize()) {
            str.append(", \"offerSize\": ").append(getOfferSize());
        }
        if (hasOfferExchangeId()) {
            str.append(", \"offerExchangeId\": ").append(getOfferExchangeId());
        }
        if (hasOfferNumOfOrders()) {
            str.append(", \"offerNumOfOrders\": ").append(getOfferNumOfOrders());
        }
        if (hasOfferQuoteId()) {
            str.append(", \"offerQuoteId\": \"").append(getOfferQuoteId()).append("\"");
        }
        if (hasSymbol()) {
            str.append(", \"symbol\": \"").append(getSymbol()).append("\"");
        }
        str.append("}");
        return str;
    }
}
