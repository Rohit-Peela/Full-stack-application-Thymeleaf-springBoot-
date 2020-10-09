package com.project.SuperAdmin.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import static org.apache.poi.ss.util.CellUtil.createCell;

@NoArgsConstructor
@AllArgsConstructor
public class UserExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet InstitutionDetailssheet,
            BureauConfigDeatilssheet,
            InternalAutoInventorysheet,
            BackendProductLookUpsheet,
            InstitutionCrossProductDetailssheet,
            IPWhiteListingsheet,
            TaxLookUpsheet,
            EmailTemplateDetailssheet,
            PartnerDetailssheet,
            SchoolEligibilityLookupsheet,
            SMSTemplateDetailssheet,
            Lendersheet,
            LenderDocuSignConfigsheet,
            LenderMaxDTILookupsheet,
            LenderMenusheet,
            LenderSubProductsheet;

    private List<InstitutionDetails> institutionDetailsList;

    private List<BureauConfigDetails> bureauConfigDetailsList;

    private List<InternalAutoInventory> internalAutoInventoryList;

    private List<BackendProductLookUp> backendProductLookUpList;

    private List<InstitutionCrossProductDetails> institutionCrossProductDetailsList;

    private List<IPWhiteListing> ipWhiteListingList;

    private List<TaxLookUp> taxLookUpList;

    private List<EmailTemplateDetails> emailTemplateDetailsList;

    private List<PartnerDetails> partnerDetailsList;

    private List<SchoolEligibilityLookup> schoolEligibilityLookupList;

    private List<SMSTemplateDetails> smsTemplateDetailsList;

    private List<Lender> lenderList;

    private List<LenderDocuSignConfig> lenderDocuSignConfigList;

    private List<LenderMaxDTILookup> lenderMaxDTILookupList;

    private List<LenderMenu> lenderMenuList;

    private List<LenderSubProduct> lenderSubProductList;

    public UserExcelExporter(List<InstitutionDetails> institutionDetailsList,
                             List<BureauConfigDetails> bureauConfigDetails,
                             List<InternalAutoInventory> internalAutoInventoryList,
                             List<BackendProductLookUp> backendProductLookUpList,
                             List<InstitutionCrossProductDetails> institutionCrossProductDetailsList,
                             List<IPWhiteListing> ipWhiteListingList,
                             List<TaxLookUp> taxLookUpList,
                             List<EmailTemplateDetails> emailTemplateDetailsList,
                             List<PartnerDetails> partnerDetailsList,
                             List<SchoolEligibilityLookup> schoolEligibilityLookupList,
                             List<SMSTemplateDetails> smsTemplateDetailsList,
                             List<Lender> lenderList,
                             List<LenderDocuSignConfig> lenderDocuSignConfigList,
                             List<LenderMaxDTILookup> lenderMaxDTILookupList,
                             List<LenderMenu> lenderMenuList,
                             List<LenderSubProduct> lenderSubProductList) {

        this.institutionDetailsList = institutionDetailsList;
        this.bureauConfigDetailsList = bureauConfigDetails;
        this.internalAutoInventoryList = internalAutoInventoryList;
        this.backendProductLookUpList = backendProductLookUpList;
        this.institutionCrossProductDetailsList = institutionCrossProductDetailsList;
        this.ipWhiteListingList = ipWhiteListingList;
        this.taxLookUpList = taxLookUpList;
        this.emailTemplateDetailsList = emailTemplateDetailsList;
        this.partnerDetailsList = partnerDetailsList;
        this.schoolEligibilityLookupList = schoolEligibilityLookupList;
        this.smsTemplateDetailsList = smsTemplateDetailsList;
        this.lenderList = lenderList;
        this.lenderDocuSignConfigList = lenderDocuSignConfigList;
        this.lenderMaxDTILookupList = lenderMaxDTILookupList;
        this.lenderMenuList = lenderMenuList;
        this.lenderSubProductList = lenderSubProductList;
        workbook = new XSSFWorkbook();
    }

    public void writeHeaderLine() {
        InstitutionDetailssheet = workbook.createSheet("InstitutionDetails");

        Row row = InstitutionDetailssheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        createCell(row, 0, "institutionDetailsId", style);
        createCell(row, 1, "institutionName", style);
        createCell(row, 2, "institutionCode", style);
        createCell(row, 3, "ssnUpdateModel", style);
        createCell(row, 4, "returnUrl", style);
        createCell(row, 5, "thresholdRelevanceScore", style);

        for (int i = 0; i < 6; i++) {
            InstitutionDetailssheet.autoSizeColumn(i);
        }

        BureauConfigDeatilssheet = workbook.createSheet("bureauConfigDetails");

        Row row1 = BureauConfigDeatilssheet.createRow(0);

        createCell(row1, 0, "bureauConfigId", style);
        createCell(row1, 1, "institutionCode", style);
        createCell(row1, 2, "bureauName", style);
        createCell(row1, 3, "bureauScoreCode", style);
        createCell(row1, 4, "bureauAdditionalScoreCode", style);
        createCell(row1, 5, "inquiryType", style);
        createCell(row1, 6, "endPoint", style);
        createCell(row1, 7, "userName", style);
        createCell(row1, 8, "password", style);
        createCell(row1, 9, "cbcCustomerId", style);
        createCell(row1, 10, "tuSubscriberPrefixCode", style);
        createCell(row1, 11, "tuKeyStoreLocation", style);
        createCell(row1, 12, "tuCertPassword", style);
        createCell(row1, 13, "tuIndustryCode", style);
        createCell(row1, 14, "tuProductCode", style);

        for (int i = 0; i < 15; i++) {
            BureauConfigDeatilssheet.autoSizeColumn(i);
        }


        InternalAutoInventorysheet = workbook.createSheet("InternalAutoInventory");

        Row row2 = InternalAutoInventorysheet.createRow(0);

        createCell(row2, 0, "internalAutoInventoryId", style);
        createCell(row2, 1, "year", style);
        createCell(row2, 2, "make", style);
        createCell(row2, 3, "model", style);
        createCell(row2, 4, "series", style);
        createCell(row2, 5, "effectiveDate", style);
        createCell(row2, 6, "endDate", style);
        createCell(row2, 7, "institutionCode", style);
        createCell(row2, 8, "loanPurpose", style);
        createCell(row2, 9, "imageUrl", style);
        createCell(row2, 10, "displayOrder", style);
        createCell(row2, 11, "displayPrice", style);
        createCell(row2, 12, "msrp", style);
        createCell(row2, 13, "invoicePrice", style);

        for (int i = 0; i < 14; i++) {
            InternalAutoInventorysheet.autoSizeColumn(i);
        }


        BackendProductLookUpsheet = workbook.createSheet("BackendProductLookUp");

        Row row3 = BackendProductLookUpsheet.createRow(0);

        createCell(row3, 0, "backendProductLookUpId", style);
        createCell(row3, 1, "institutionCode", style);
        createCell(row3, 2, "productName", style);
        createCell(row3, 3, "lenderName", style);
        createCell(row3, 4, "effectiveDate", style);
        createCell(row3, 5, "endDate", style);
        createCell(row3, 6, "loanPurpose", style);

        for (int i = 0; i < 7; i++) {
            BackendProductLookUpsheet.autoSizeColumn(i);
        }

        InstitutionCrossProductDetailssheet = workbook.createSheet("InstitutionCrossProductDetails");

        Row row4 = InstitutionCrossProductDetailssheet.createRow(0);

        createCell(row4, 0, "institutionCrossProductDetailsId", style);
        createCell(row4, 1, "institutionCode", style);
        createCell(row4, 2, "loanPurpose", style);
        createCell(row4, 3, "minFICO", style);
        createCell(row4, 4, "maxFICO", style);
        createCell(row4, 5, "effectiveDate", style);
        createCell(row4, 6, "endDate", style);

        for (int i = 0; i < 7; i++) {
            InstitutionCrossProductDetailssheet.autoSizeColumn(i);
        }

        IPWhiteListingsheet = workbook.createSheet("IPWhiteListing");

        Row row5 = IPWhiteListingsheet.createRow(0);

        createCell(row5, 0, "ipId", style);
        createCell(row5, 1, "institutionCode", style);
        createCell(row5, 2, "idAddress", style);
        createCell(row5, 3, "apiName", style);

        for (int i = 0; i < 4; i++) {
            IPWhiteListingsheet.autoSizeColumn(i);
        }

        TaxLookUpsheet = workbook.createSheet("TaxLookUp");

        Row row6 = TaxLookUpsheet.createRow(0);

        createCell(row6, 0, "id", style);
        createCell(row6, 1, "zip", style);
        createCell(row6, 2, "city", style);
        createCell(row6, 3, "county", style);
        createCell(row6, 4, "state", style);
        createCell(row6, 5, "country", style);
        createCell(row6, 6, "taxType", style);
        createCell(row6, 7, "loanPurpose", style);
        createCell(row6, 8, "institutionCode", style);
        createCell(row6, 9, "basis", style);
        createCell(row6, 10, "fixedTax", style);
        createCell(row6, 11, "variableTax", style);
        createCell(row6, 12, "effectiveDate", style);
        createCell(row6, 13, "endDate", style);

        for (int i = 0; i < 14; i++) {
            TaxLookUpsheet.autoSizeColumn(i);
        }

        EmailTemplateDetailssheet = workbook.createSheet("EmailTemplateDetails");

        Row row7 = EmailTemplateDetailssheet.createRow(0);

        createCell(row7, 0, "emailTemplateId", style);
        createCell(row7, 1, "institutionName", style);
        createCell(row7, 2, "channel", style);
        createCell(row7, 3, "loanPurpose", style);
        createCell(row7, 4, "communicationType", style);
        createCell(row7, 5, "templateName", style);
        createCell(row7, 6, "templateDesc", style);
        createCell(row7, 7, "activeIndicator", style);
        createCell(row7, 8, "day", style);
        createCell(row7, 9, "fromEmail", style);
        createCell(row7, 10, "sendGridApiKey", style);
        createCell(row7, 11, "subject", style);

        for (int i = 0; i < 12; i++) {
            EmailTemplateDetailssheet.autoSizeColumn(i);
        }

        PartnerDetailssheet = workbook.createSheet("PartnerDetails");

        Row row8 = PartnerDetailssheet.createRow(0);

        createCell(row8, 0, "partnerDetailsId", style);
        createCell(row8, 1, "partnerNumber", style);
        createCell(row8, 2, "partnerName", style);
        createCell(row8, 3, "apiKey", style);
        createCell(row8, 4, "referrerId", style);
        createCell(row8, 5, "channel", style);
        createCell(row8, 6, "institutionCode", style);
        createCell(row8, 7, "defaultIndicator", style);

        for (int i = 0; i < 8; i++) {
            PartnerDetailssheet.autoSizeColumn(i);
        }

        SchoolEligibilityLookupsheet = workbook.createSheet("SchoolEligibilityLookup");

        Row row9 = SchoolEligibilityLookupsheet.createRow(0);

        createCell(row9, 0, "schoolEligibilityLookupId", style);
        createCell(row9, 1, "institutionCode", style);
        createCell(row9, 2, "lender", style);
        createCell(row9, 3, "schoolName", style);
        createCell(row9, 4, "effectiveDate", style);
        createCell(row9, 5, "expirationDate", style);

        for (int i = 0; i < 6; i++) {
            SchoolEligibilityLookupsheet.autoSizeColumn(i);
        }

        SMSTemplateDetailssheet = workbook.createSheet("SMSTemplateDetails");

        Row row10 = SMSTemplateDetailssheet.createRow(0);

        createCell(row10, 0, "smsTemplateId", style);
        createCell(row10, 1, "institutionName", style);
        createCell(row10, 2, "channel", style);
        createCell(row10, 3, "loanPurpose", style);
        createCell(row10, 4, "communicationType", style);
        createCell(row10, 5, "smsText", style);
        createCell(row10, 6, "activeIndicator", style);
        createCell(row10, 7, "day", style);
        createCell(row10, 8, "fromPhoneNUmber", style);
        createCell(row10, 9, "twilioAccountSid", style);
        createCell(row10, 10, "twilioAccountToken", style);

        for (int i = 0; i < 11; i++) {
            SMSTemplateDetailssheet.autoSizeColumn(i);
        }

        Lendersheet = workbook.createSheet("Lender");

        Row row11 = Lendersheet.createRow(0);

        createCell(row11, 0, "lenderId", style);
        createCell(row11, 1, "bankIcon", style);
        createCell(row11, 2, "institutionCode", style);
        createCell(row11, 3, "dba", style);
        createCell(row11, 4, "contact", style);
        createCell(row11, 5, "contactPerson", style);
        createCell(row11, 6, "email", style);
        createCell(row11, 7, "addressId", style);
        createCell(row11, 8, "type", style);
        createCell(row11, 9, "name", style);
        createCell(row11, 10, "achDiscountRate", style);
        createCell(row11, 11, "discountedPrice", style);
        createCell(row11, 12, "isLenderOfferAch", style);
        createCell(row11, 13, "valueType", style);
        createCell(row11, 14, "loanPurpose", style);
        createCell(row11, 15, "termBasedLoan", style);
        createCell(row11, 16, "minLoanAmount", style);
        createCell(row11, 17, "maxLoanAmount", style);
        createCell(row11, 18, "relevanceScore", style);
        createCell(row11, 19, "variableBaseRate", style);
        createCell(row11, 20, "fixedBaseRate", style);
        createCell(row11, 21, "effectiveDate;", style);
        createCell(row11, 22, "expirationDate", style);
        createCell(row11, 23, "finalSubmitChannel", style);
        createCell(row11, 24, "finalSubmitEmailId", style);
        createCell(row11, 25, "finalSubmitMessage", style);
        createCell(row11, 26, "finalSubmitWebForwardLink", style);
        createCell(row11, 27, "crossSellEnabled", style);

        for (int i = 0; i < 28; i++) {
            Lendersheet.autoSizeColumn(i);
        }

        LenderDocuSignConfigsheet = workbook.createSheet("LenderDocuSignConfig");

        Row row12 = LenderDocuSignConfigsheet.createRow(0);

        createCell(row12, 0, "lenderDocuSignConfigId", style);
        createCell(row12, 1, "institutionCode", style);
        createCell(row12, 2, "lenderName", style);
        createCell(row12, 3, "serviceProvider", style);
        createCell(row12, 4, "applicationType", style);
        createCell(row12, 5, "loanPurpose", style);
        createCell(row12, 6, "integrationKey", style);
        createCell(row12, 7, "userGuid", style);
        createCell(row12, 8, "brandId", style);
        createCell(row12, 9, "edocControlid", style);
        createCell(row12, 10, "edocUser", style);
        createCell(row12, 11, "edocEKey", style);
        createCell(row12, 12, "templateName", style);
        createCell(row12, 13, "effectiveDate", style);
        createCell(row12, 14, "expirationDate", style);

        for (int i = 0; i < 15; i++) {
            LenderDocuSignConfigsheet.autoSizeColumn(i);
        }

        LenderMaxDTILookupsheet = workbook.createSheet("LenderMaxDTILookup");

        Row row13 = LenderMaxDTILookupsheet.createRow(0);

        createCell(row13, 0, "lenderMaxDTILookupId", style);
        createCell(row13, 1, "institutionCode", style);
        createCell(row13, 2, "lenderName", style);
        createCell(row13, 3, "loanPurpose", style);
        createCell(row13, 4, "maxDti", style);
        createCell(row13, 5, "maxPti", style);
        createCell(row13, 6, "minIncome", style);
        createCell(row13, 7, "maxIncome", style);
        createCell(row13, 8, "effectiveDate", style);
        createCell(row13, 9, "expirationDate", style);

        for (int i = 0; i < 10; i++) {
            LenderMaxDTILookupsheet.autoSizeColumn(i);
        }

        LenderMenusheet = workbook.createSheet("LenderMenu");

        Row row14 = LenderMenusheet.createRow(0);

        createCell(row14, 0, "menuId", style);
        createCell(row14, 1, "lenderId", style);
        createCell(row14, 2, "title", style);
        createCell(row14, 3, "link", style);
        createCell(row14, 4, "parentMenuId", style);
        createCell(row14, 5, "internal", style);
        createCell(row14, 6, "icon", style);
        createCell(row14, 7, "href", style);
        createCell(row14, 8, "institutionCode", style);

        for (int i = 0; i < 9; i++) {
            LenderMenusheet.autoSizeColumn(i);
        }

        LenderSubProductsheet = workbook.createSheet("LenderSubProduct");

        Row row15 = LenderSubProductsheet.createRow(0);

        createCell(row15, 0, "lenderSubProductId", style);
        createCell(row15, 1, "institutionCode", style);
        createCell(row15, 2, "lenderName", style);
        createCell(row15, 3, "loanPurpose", style);
        createCell(row15, 4, "subProductName", style);
        createCell(row15, 5, "effectiveDate", style);
        createCell(row15, 6, "expirationDate", style);

        for (int i = 0; i < 7; i++) {
            LenderSubProductsheet.autoSizeColumn(i);
        }
    }

    private void createCell(Row row, int columnCount, Object value, CellStyle style) {

        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        } else if (value instanceof Long) {
            cell.setCellValue((Long) value);
        } else if (value instanceof Double) {
            cell.setCellValue((Double) value);
        } else if (value instanceof Timestamp) {
            cell.setCellValue((Timestamp) value);
        } else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);

    }

    private void writeDataLines() {
        int rowCount = 1;

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for (InstitutionDetails institutionDetails : institutionDetailsList) {
            Row row = InstitutionDetailssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, institutionDetails.getInstitutionDetailsId(), style);
            createCell(row, columnCount++, institutionDetails.getInstitutionName(), style);
            createCell(row, columnCount++, institutionDetails.getInstitutionCode(), style);
            createCell(row, columnCount++, institutionDetails.getSsnUpdateModel(), style);
            createCell(row, columnCount++, institutionDetails.getReturnUrl(), style);
            createCell(row, columnCount++, institutionDetails.getThresholdRelevanceScore(), style);
        }

        rowCount = 1;
        for (BureauConfigDetails bureauConfigDetails : bureauConfigDetailsList) {
            Row row = BureauConfigDeatilssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, bureauConfigDetails.getBureauConfigId(), style);
            createCell(row, columnCount++, bureauConfigDetails.getInstitutionCode(), style);
            createCell(row, columnCount++, bureauConfigDetails.getBureauName(), style);
            createCell(row, columnCount++, bureauConfigDetails.getBureauScoreCode(), style);
            createCell(row, columnCount++, bureauConfigDetails.getBureauAdditionalScoreCode(), style);
            createCell(row, columnCount++, bureauConfigDetails.getInquiryType(), style);
            createCell(row, columnCount++, bureauConfigDetails.getEndPoint(), style);
            createCell(row, columnCount++, bureauConfigDetails.getUserName(), style);
            createCell(row, columnCount++, bureauConfigDetails.getPassword(), style);
            createCell(row, columnCount++, bureauConfigDetails.getCbcCustomerId(), style);
            createCell(row, columnCount++, bureauConfigDetails.getTuSubscriberPrefixCode(), style);
            createCell(row, columnCount++, bureauConfigDetails.getTuKeyStoreLocation(), style);
            createCell(row, columnCount++, bureauConfigDetails.getTuCertPassword(), style);
            createCell(row, columnCount++, bureauConfigDetails.getTuIndustryCode(), style);
            createCell(row, columnCount++, bureauConfigDetails.getTuProductCode(), style);
            BureauConfigDeatilssheet.autoSizeColumn(columnCount);

        }

        rowCount = 1;
        for (InternalAutoInventory internalAutoInventory : internalAutoInventoryList) {
            Row row = InternalAutoInventorysheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, internalAutoInventory.getInternalAutoInventoryId(), style);
            createCell(row, columnCount++, internalAutoInventory.getYear(), style);
            createCell(row, columnCount++, internalAutoInventory.getMake(), style);
            createCell(row, columnCount++, internalAutoInventory.getModel(), style);
            createCell(row, columnCount++, internalAutoInventory.getSeries(), style);
            createCell(row, columnCount++, internalAutoInventory.getEffectiveDate(), style);
            createCell(row, columnCount++, internalAutoInventory.getEndDate(), style);
            createCell(row, columnCount++, internalAutoInventory.getInstitutionCode(), style);
            createCell(row, columnCount++, internalAutoInventory.getLoanPurpose(), style);
            createCell(row, columnCount++, internalAutoInventory.getImageUrl(), style);
            createCell(row, columnCount++, internalAutoInventory.getDisplayOrder(), style);
            createCell(row, columnCount++, internalAutoInventory.getDisplayPrice(), style);
            createCell(row, columnCount++, internalAutoInventory.getMsrp(), style);
            createCell(row, columnCount++, internalAutoInventory.getInvoicePrice(), style);
        }

        rowCount = 1;
        for (BackendProductLookUp backendProductLookUp : backendProductLookUpList) {
            Row row = BackendProductLookUpsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, backendProductLookUp.getBackendProductLookUpId(), style);
            createCell(row, columnCount++, backendProductLookUp.getInstitutionCode(), style);
            createCell(row, columnCount++, backendProductLookUp.getProductName(), style);
            createCell(row, columnCount++, backendProductLookUp.getLenderName(), style);
            createCell(row, columnCount++, backendProductLookUp.getEffectiveDate(), style);
            createCell(row, columnCount++, backendProductLookUp.getEndDate(), style);
            createCell(row, columnCount++, backendProductLookUp.getLoanPurpose(), style);
        }

        rowCount = 1;
        for (InstitutionCrossProductDetails institutionCrossProductDetails : institutionCrossProductDetailsList) {
            Row row = InstitutionCrossProductDetailssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, institutionCrossProductDetails.getInstitutionCrossProductDetailsId(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getInstitutionCode(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getLoanPurpose(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getMinFICO(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getMaxFICO(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getEffectiveDate(), style);
            createCell(row, columnCount++, institutionCrossProductDetails.getEndDate(), style);
        }

        rowCount = 1;
        for (IPWhiteListing ipWhiteListing : ipWhiteListingList) {
            Row row = IPWhiteListingsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, ipWhiteListing.getIpId(), style);
            createCell(row, columnCount++, ipWhiteListing.getInstitutionCode(), style);
            createCell(row, columnCount++, ipWhiteListing.getIdAddress(), style);
            createCell(row, columnCount++, ipWhiteListing.getApiName(), style);
        }

        rowCount = 1;
        for (TaxLookUp taxLookUp : taxLookUpList) {
            Row row = TaxLookUpsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, taxLookUp.getId(), style);
            createCell(row, columnCount++, taxLookUp.getZip(), style);
            createCell(row, columnCount++, taxLookUp.getCity(), style);
            createCell(row, columnCount++, taxLookUp.getCounty(), style);
            createCell(row, columnCount++, taxLookUp.getState(), style);
            createCell(row, columnCount++, taxLookUp.getCountry(), style);
            createCell(row, columnCount++, taxLookUp.getTaxType(), style);
            createCell(row, columnCount++, taxLookUp.getLoanPurpose(), style);
            createCell(row, columnCount++, taxLookUp.getInstitutionCode(), style);
            createCell(row, columnCount++, taxLookUp.getBasis(), style);
            createCell(row, columnCount++, taxLookUp.getFixedTax(), style);
            createCell(row, columnCount++, taxLookUp.getVariableTax(), style);
            createCell(row, columnCount++, taxLookUp.getEffectiveDate(), style);
            createCell(row, columnCount++, taxLookUp.getEndDate(), style);
        }

        rowCount = 1;
        for (EmailTemplateDetails emailTemplateDetails : emailTemplateDetailsList) {
            Row row = EmailTemplateDetailssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, emailTemplateDetails.getEmailTemplateId(), style);
            createCell(row, columnCount++, emailTemplateDetails.getInstitutionName(), style);
            createCell(row, columnCount++, emailTemplateDetails.getChannel(), style);
            createCell(row, columnCount++, emailTemplateDetails.getLoanPurpose(), style);
            createCell(row, columnCount++, emailTemplateDetails.getCommunicationType(), style);
            createCell(row, columnCount++, emailTemplateDetails.getTemplateName(), style);
            createCell(row, columnCount++, emailTemplateDetails.getTemplateDesc(), style);
            createCell(row, columnCount++, emailTemplateDetails.getActiveIndicator(), style);
            createCell(row, columnCount++, emailTemplateDetails.getDay(), style);
            createCell(row, columnCount++, emailTemplateDetails.getFromEmail(), style);
            createCell(row, columnCount++, emailTemplateDetails.getSendGridApiKey(), style);
            createCell(row, columnCount++, emailTemplateDetails.getSubject(), style);
        }

        rowCount = 1;
        for (PartnerDetails partnerDetails : partnerDetailsList) {
            Row row = PartnerDetailssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, partnerDetails.getPartnerDetailsId(), style);
            createCell(row, columnCount++, partnerDetails.getPartnerNumber(), style);
            createCell(row, columnCount++, partnerDetails.getPartnerName(), style);
            createCell(row, columnCount++, partnerDetails.getApiKey(), style);
            createCell(row, columnCount++, partnerDetails.getReferrerId(), style);
            createCell(row, columnCount++, partnerDetails.getChannel(), style);
            createCell(row, columnCount++, partnerDetails.getInstitutionCode(), style);
            createCell(row, columnCount++, partnerDetails.getDefaultIndicator(), style);
        }

        rowCount = 1;
        for (SchoolEligibilityLookup schoolEligibilityLookup : schoolEligibilityLookupList) {
            Row row = SchoolEligibilityLookupsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, schoolEligibilityLookup.getSchoolEligibilityLookupId(), style);
            createCell(row, columnCount++, schoolEligibilityLookup.getInstitutionCode(), style);
            createCell(row, columnCount++, schoolEligibilityLookup.getLender(), style);
            createCell(row, columnCount++, schoolEligibilityLookup.getSchoolName(), style);
            createCell(row, columnCount++, schoolEligibilityLookup.getEffectiveDate(), style);
            createCell(row, columnCount++, schoolEligibilityLookup.getExpirationDate(), style);
        }

        rowCount = 1;
        for (SMSTemplateDetails smsTemplateDetails : smsTemplateDetailsList) {
            Row row = SMSTemplateDetailssheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, smsTemplateDetails.getSmsTemplateId(), style);
            createCell(row, columnCount++, smsTemplateDetails.getInstitutionName(), style);
            createCell(row, columnCount++, smsTemplateDetails.getChannel(), style);
            createCell(row, columnCount++, smsTemplateDetails.getLoanPurpose(), style);
            createCell(row, columnCount++, smsTemplateDetails.getCommunicationType(), style);
            createCell(row, columnCount++, smsTemplateDetails.getSmsText(), style);
            createCell(row, columnCount++, smsTemplateDetails.getActiveIndicator(), style);
            createCell(row, columnCount++, smsTemplateDetails.getDay(), style);
            createCell(row, columnCount++, smsTemplateDetails.getFromPhoneNUmber(), style);
            createCell(row, columnCount++, smsTemplateDetails.getTwilioAccountSid(), style);
            createCell(row, columnCount++, smsTemplateDetails.getTwilioAccountToken(), style);
        }

        rowCount = 1;
        for (Lender lender : lenderList) {
            Row row = Lendersheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, lender.getLenderId(), style);
            createCell(row, columnCount++, lender.getBankIcon(), style);
            createCell(row, columnCount++, lender.getInstitutionCode(), style);
            createCell(row, columnCount++, lender.getDba(), style);
            createCell(row, columnCount++, lender.getContact(), style);
            createCell(row, columnCount++, lender.getContactPerson(), style);
            createCell(row, columnCount++, lender.getEmail(), style);
            createCell(row, columnCount++, lender.getAddressId(), style);
            createCell(row, columnCount++, lender.getType(), style);
            createCell(row, columnCount++, lender.getName(), style);
            createCell(row, columnCount++, lender.getAchDiscountRate(), style);
            createCell(row, columnCount++, lender.getDiscountedPrice(), style);
            createCell(row, columnCount++, lender.getIsLenderOfferAch(), style);
            createCell(row, columnCount++, lender.getValueType(), style);
            createCell(row, columnCount++, lender.getLoanPurpose(), style);
            createCell(row, columnCount++, lender.getTermBasedLoan(), style);
            createCell(row, columnCount++, lender.getMinLoanAmount(), style);
            createCell(row, columnCount++, lender.getMaxLoanAmount(), style);
            createCell(row, columnCount++, lender.getRelevanceScore(), style);
            createCell(row, columnCount++, lender.getVariableBaseRate(), style);
            createCell(row, columnCount++, lender.getFixedBaseRate(), style);
            createCell(row, columnCount++, lender.getEffectiveDate(), style);
            createCell(row, columnCount++, lender.getExpirationDate(), style);
            createCell(row, columnCount++, lender.getFinalSubmitChannel(), style);
            createCell(row, columnCount++, lender.getFinalSubmitEmailId(), style);
            createCell(row, columnCount++, lender.getFinalSubmitMessage(), style);
            createCell(row, columnCount++, lender.getFinalSubmitWebForwardLink(), style);
            createCell(row, columnCount++, lender.getCrossSellEnabled(), style);
        }

        rowCount = 1;
        for (LenderDocuSignConfig lenderDocuSignConfig : lenderDocuSignConfigList) {
            Row row = LenderDocuSignConfigsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, lenderDocuSignConfig.getLenderDocuSignConfigId(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getInstitutionCode(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getLenderName(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getServiceProvider(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getApplicationType(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getLoanPurpose(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getIntegrationKey(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getUserGuid(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getBrandId(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getEdocControlid(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getEdocUser(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getEdocEKey(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getTemplateName(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getEffectiveDate(), style);
            createCell(row, columnCount++, lenderDocuSignConfig.getExpirationDate(), style);

        }

        rowCount = 1;
        for (LenderMaxDTILookup lenderMaxDTILookup : lenderMaxDTILookupList) {
            Row row = LenderMaxDTILookupsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, lenderMaxDTILookup.getLenderMaxDTILookupId(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getInstitutionCode(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getLenderName(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getLoanPurpose(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getMaxDti(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getMaxPti(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getMinIncome(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getMaxIncome(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getEffectiveDate(), style);
            createCell(row, columnCount++, lenderMaxDTILookup.getExpirationDate(), style);
        }

        rowCount = 1;
        for (LenderMenu lenderMenu : lenderMenuList) {
            Row row = LenderMenusheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, lenderMenu.getMenuId(), style);
            createCell(row, columnCount++, lenderMenu.getLenderId(), style);
            createCell(row, columnCount++, lenderMenu.getTitle(), style);
            createCell(row, columnCount++, lenderMenu.getLink(), style);
            createCell(row, columnCount++, lenderMenu.getParentMenuId(), style);
            createCell(row, columnCount++, lenderMenu.getInternal(), style);
            createCell(row, columnCount++, lenderMenu.getIcon(), style);
            createCell(row, columnCount++, lenderMenu.getHref(), style);
            createCell(row, columnCount++, lenderMenu.getInstitutionCode(), style);
        }

        rowCount = 1;
        for (LenderSubProduct lenderSubProduct : lenderSubProductList) {
            Row row = LenderSubProductsheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, lenderSubProduct.getLenderSubProductId(), style);
            createCell(row, columnCount++, lenderSubProduct.getInstitutionCode(), style);
            createCell(row, columnCount++, lenderSubProduct.getLenderName(), style);
            createCell(row, columnCount++, lenderSubProduct.getLoanPurpose(), style);
            createCell(row, columnCount++, lenderSubProduct.getSubProductName(), style);
            createCell(row, columnCount++, lenderSubProduct.getEffectiveDate(), style);
            createCell(row, columnCount++, lenderSubProduct.getExpirationDate(), style);

        }

    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();
    }
}
