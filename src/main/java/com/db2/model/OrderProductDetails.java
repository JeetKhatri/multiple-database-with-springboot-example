package com.db2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Jeet Khatri
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderProductDetails {

	@Id
	@JsonProperty("id")
	private int id;
	@JsonProperty("order_id")
	private int orderId;
	@JsonProperty("product_id")
	private int productId;
	@JsonProperty("variant_id")
	private int variantId;
	@JsonProperty("order_address_id")
	private int orderAddressId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("upc")
	private String upc;
	@JsonProperty("type")
	private String type;
	@JsonProperty("base_price")
	private double basePrice;
	@JsonProperty("price_ex_tax")
	private double priceExTax;
	@JsonProperty("price_inc_tax")
	private double priceIncTax;
	@JsonProperty("price_tax")
	private double priceTax;
	@JsonProperty("base_total")
	private double baseTotal;
	@JsonProperty("total_ex_tax")
	private double totalExTax;
	@JsonProperty("total_inc_tax")
	private double totalIncTax;
	@JsonProperty("total_tax")
	private double total_tax;
	@JsonProperty("weight")
	private double weight;
	@JsonProperty("width")
	private double width;
	@JsonProperty("height")
	private double height;
	@JsonProperty("depth")
	private double depth;
	@JsonProperty("quantity")
	private int quantity;
	@JsonProperty("base_cost_price")
	private double baseCostPrice;
	@JsonProperty("cost_price_inc_tax")
	private double costPriceIncTax;
	@JsonProperty("cost_price_ex_tax")
	private double costPriceExTax;
	@JsonProperty("cost_price_tax")
	private double costPriceTax;
	@JsonProperty("is_refunded")
	private boolean isRefunded;
	@JsonProperty("quantity_refunded")
	private int quantityRefunded;
	@JsonProperty("refund_amount")
	private double refundAmount;
	@JsonProperty("return_id")
	private int returnId;
	@JsonProperty("wrapping_name")
	private String wrappingName;
	@JsonProperty("base_wrapping_cost")
	private double baseWrappingCost;
	@JsonProperty("wrapping_cost_ex_tax")
	private double wrappingCostExTax;
	@JsonProperty("wrapping_cost_inc_tax")
	private double wrappingCostIncTax;
	@JsonProperty("wrapping_cost_tax")
	private double wrappingCostTax;
	@JsonProperty("wrapping_message")
	private String wrappingMessage;
	@JsonProperty("quantity_shipped")
	private int quantityShipped;
	@JsonProperty("event_name")
	private String eventName;
	@JsonProperty("event_date")
	private String eventDate;
	@JsonProperty("fixed_shipping_cost")
	private double fixedShippingCost;
	@JsonProperty("ebay_item_id")
	private String ebayItemId;
	@JsonProperty("ebay_transaction_id")
	private String ebayTransactionId;
	@JsonProperty("option_set_id")
	private int optionSetId;
	@JsonProperty("parent_order_product_id")
	private String parentOrderProductId;
	@JsonProperty("is_bundled_product")
	private boolean isBundledProduct;
	@JsonProperty("bin_picking_number")
	private String binPickingNumber;
	@JsonProperty("external_id")
	private String externalId;
	@JsonProperty("fulfillment_source")
	private String fulfillmentSource;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public int getOrderAddressId() {
		return orderAddressId;
	}
	public void setOrderAddressId(int orderAddressId) {
		this.orderAddressId = orderAddressId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getPriceExTax() {
		return priceExTax;
	}
	public void setPriceExTax(double priceExTax) {
		this.priceExTax = priceExTax;
	}
	public double getPriceIncTax() {
		return priceIncTax;
	}
	public void setPriceIncTax(double priceIncTax) {
		this.priceIncTax = priceIncTax;
	}
	public double getPriceTax() {
		return priceTax;
	}
	public void setPriceTax(double priceTax) {
		this.priceTax = priceTax;
	}
	public double getBaseTotal() {
		return baseTotal;
	}
	public void setBaseTotal(double baseTotal) {
		this.baseTotal = baseTotal;
	}
	public double getTotalExTax() {
		return totalExTax;
	}
	public void setTotalExTax(double totalExTax) {
		this.totalExTax = totalExTax;
	}
	public double getTotalIncTax() {
		return totalIncTax;
	}
	public void setTotalIncTax(double totalIncTax) {
		this.totalIncTax = totalIncTax;
	}
	public double getTotal_tax() {
		return total_tax;
	}
	public void setTotal_tax(double total_tax) {
		this.total_tax = total_tax;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBaseCostPrice() {
		return baseCostPrice;
	}
	public void setBaseCostPrice(double baseCostPrice) {
		this.baseCostPrice = baseCostPrice;
	}
	public double getCostPriceIncTax() {
		return costPriceIncTax;
	}
	public void setCostPriceIncTax(double costPriceIncTax) {
		this.costPriceIncTax = costPriceIncTax;
	}
	public double getCostPriceExTax() {
		return costPriceExTax;
	}
	public void setCostPriceExTax(double costPriceExTax) {
		this.costPriceExTax = costPriceExTax;
	}
	public double getCostPriceTax() {
		return costPriceTax;
	}
	public void setCostPriceTax(double costPriceTax) {
		this.costPriceTax = costPriceTax;
	}
	public boolean isRefunded() {
		return isRefunded;
	}
	public void setRefunded(boolean isRefunded) {
		this.isRefunded = isRefunded;
	}
	public int getQuantityRefunded() {
		return quantityRefunded;
	}
	public void setQuantityRefunded(int quantityRefunded) {
		this.quantityRefunded = quantityRefunded;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public int getReturnId() {
		return returnId;
	}
	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}
	public String getWrappingName() {
		return wrappingName;
	}
	public void setWrappingName(String wrappingName) {
		this.wrappingName = wrappingName;
	}
	public double getBaseWrappingCost() {
		return baseWrappingCost;
	}
	public void setBaseWrappingCost(double baseWrappingCost) {
		this.baseWrappingCost = baseWrappingCost;
	}
	public double getWrappingCostExTax() {
		return wrappingCostExTax;
	}
	public void setWrappingCostExTax(double wrappingCostExTax) {
		this.wrappingCostExTax = wrappingCostExTax;
	}
	public double getWrappingCostIncTax() {
		return wrappingCostIncTax;
	}
	public void setWrappingCostIncTax(double wrappingCostIncTax) {
		this.wrappingCostIncTax = wrappingCostIncTax;
	}
	public double getWrappingCostTax() {
		return wrappingCostTax;
	}
	public void setWrappingCostTax(double wrappingCostTax) {
		this.wrappingCostTax = wrappingCostTax;
	}
	public String getWrappingMessage() {
		return wrappingMessage;
	}
	public void setWrappingMessage(String wrappingMessage) {
		this.wrappingMessage = wrappingMessage;
	}
	public int getQuantityShipped() {
		return quantityShipped;
	}
	public void setQuantityShipped(int quantityShipped) {
		this.quantityShipped = quantityShipped;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public double getFixedShippingCost() {
		return fixedShippingCost;
	}
	public void setFixedShippingCost(double fixedShippingCost) {
		this.fixedShippingCost = fixedShippingCost;
	}
	public String getEbayItemId() {
		return ebayItemId;
	}
	public void setEbayItemId(String ebayItemId) {
		this.ebayItemId = ebayItemId;
	}
	public String getEbayTransactionId() {
		return ebayTransactionId;
	}
	public void setEbayTransactionId(String ebayTransactionId) {
		this.ebayTransactionId = ebayTransactionId;
	}
	public int getOptionSetId() {
		return optionSetId;
	}
	public void setOptionSetId(int optionSetId) {
		this.optionSetId = optionSetId;
	}
	public String getParentOrderProductId() {
		return parentOrderProductId;
	}
	public void setParentOrderProductId(String parentOrderProductId) {
		this.parentOrderProductId = parentOrderProductId;
	}
	public boolean isBundledProduct() {
		return isBundledProduct;
	}
	public void setBundledProduct(boolean isBundledProduct) {
		this.isBundledProduct = isBundledProduct;
	}
	public String getBinPickingNumber() {
		return binPickingNumber;
	}
	public void setBinPickingNumber(String binPickingNumber) {
		this.binPickingNumber = binPickingNumber;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getFulfillmentSource() {
		return fulfillmentSource;
	}
	public void setFulfillmentSource(String fulfillmentSource) {
		this.fulfillmentSource = fulfillmentSource;
	}
	
}
