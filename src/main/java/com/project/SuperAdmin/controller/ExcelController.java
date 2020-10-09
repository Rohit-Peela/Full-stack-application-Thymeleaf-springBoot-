package com.project.SuperAdmin.controller;


import com.project.SuperAdmin.entity.*;
import com.project.SuperAdmin.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/excel/")
public class ExcelController {

    @Autowired
    InstitutionDetailsRepository institutionDetailsRepository;

    @Autowired
    BureauConfigDetailsRepository bureauConfigDetailsRepository;

    @Autowired
    InternalAutoInventoryRepository internalAutoInventoryRepository;

    @Autowired
    BackendProductLookUpRepository backendProductLookUpRepository;

    @Autowired
    InstitutionCrossProductDetailsRepository institutionCrossProductDetailsRepository;

    @Autowired
    IPWhiteListingRepository ipWhiteListingRepository;

    @Autowired
    TaxLookUpRepository taxLookUpRepository;

    @Autowired
    EmailTemplateDetailsRepository emailTemplateDetailsRepository;

    @Autowired
    PartnerDetailsRepository partnerDetailsRepository;

    @Autowired
    SchoolEligibilityLookupRepository schoolEligibilityLookupRepository;

    @Autowired
    SMSTemplateDetailsRepository smsTemplateDetailsRepository;

    @Autowired
    LenderRepository lenderRepository;

    @Autowired
    LenderDocuSignConfigRepository lenderDocuSignConfigRepository;

    @Autowired
    LenderMaxDTILookupRepository lenderMaxDTILookupRepository;

    @Autowired
    LenderMenuRepository lenderMenuRepository;

    @Autowired
    LenderSubProductRepository lenderSubProductRepository;

    @RequestMapping("tables")
    public void exportToEXcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);


        List<InstitutionDetails> institutionDetailsList = institutionDetailsRepository.findAll();

        List<BureauConfigDetails> bureauConfigDetailsList = bureauConfigDetailsRepository.findAll();

        List<InternalAutoInventory> internalAutoInventoryList = internalAutoInventoryRepository.findAll();

        List<BackendProductLookUp> backendProductLookUpList = backendProductLookUpRepository.findAll();

        List<InstitutionCrossProductDetails> institutionCrossProductDetailsList = institutionCrossProductDetailsRepository.findAll();

        List<IPWhiteListing> ipWhiteListingList = ipWhiteListingRepository.findAll();

        List<TaxLookUp> taxLookUpList = taxLookUpRepository.findAll();

        List<EmailTemplateDetails> emailTemplateDetailsList = emailTemplateDetailsRepository.findAll();

        List<PartnerDetails> partnerDetailsList = partnerDetailsRepository.findAll();

        List<SchoolEligibilityLookup> schoolEligibilityLookupList = schoolEligibilityLookupRepository.findAll();

        List<SMSTemplateDetails> smsTemplateDetailsList = smsTemplateDetailsRepository.findAll();

        List<Lender> lenderList = lenderRepository.findAll();

        List<LenderDocuSignConfig> lenderDocuSignConfigList = lenderDocuSignConfigRepository.findAll();

        List<LenderMaxDTILookup> lenderMaxDTILookupList = lenderMaxDTILookupRepository.findAll();

        List<LenderMenu> lenderMenuList = lenderMenuRepository.findAll();

        List<LenderSubProduct> lenderSubProductList = lenderSubProductRepository.findAll();

        UserExcelExporter userExcelExporter = new UserExcelExporter(institutionDetailsList,
                bureauConfigDetailsList,
                internalAutoInventoryList,
                backendProductLookUpList,
                institutionCrossProductDetailsList,
                ipWhiteListingList,
                taxLookUpList,
                emailTemplateDetailsList,
                partnerDetailsList,
                schoolEligibilityLookupList,
                smsTemplateDetailsList,
                lenderList,
                lenderDocuSignConfigList,
                lenderMaxDTILookupList,
                lenderMenuList,
                lenderSubProductList);
        userExcelExporter.export(response);
    }
}
