package com.project.SuperAdmin.controller;

import com.project.SuperAdmin.entity.*;
import com.project.SuperAdmin.repository.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/products/")
public class ProductController {
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

    @GetMapping("show")
    public String showAllTables(Model model) {
        model.addAttribute("search", new Search());
        List<InstitutionDetails> institutionDetailsList = institutionDetailsRepository.findAll();
        model.addAttribute("institutionDetailsList", institutionDetailsList);
        List<BureauConfigDetails> bureauConfigDetailsList = bureauConfigDetailsRepository.findAll();
        model.addAttribute("bureauConfigDetailsList", bureauConfigDetailsList);
        List<InternalAutoInventory> internalAutoInventoryList = internalAutoInventoryRepository.findAll();
        model.addAttribute("internalAutoInventoryList", internalAutoInventoryList);
        List<BackendProductLookUp> backendProductLookUpList = backendProductLookUpRepository.findAll();
        model.addAttribute("backendProductLookUpList", backendProductLookUpList);
        List<InstitutionCrossProductDetails> institutionCrossProductDetailsList = institutionCrossProductDetailsRepository.findAll();
        model.addAttribute("institutionCrossProductDetailsList", institutionCrossProductDetailsList);
        List<IPWhiteListing> ipWhiteListingList = ipWhiteListingRepository.findAll();
        model.addAttribute("ipWhiteListingList", ipWhiteListingList);
        List<TaxLookUp> taxLookUpList = taxLookUpRepository.findAll();
        model.addAttribute("taxLookUpList", taxLookUpList);
        List<EmailTemplateDetails> emailTemplateDetailsList = emailTemplateDetailsRepository.findAll();
        model.addAttribute("emailTemplateDetailsList", emailTemplateDetailsList);
        List<PartnerDetails> partnerDetailsList = partnerDetailsRepository.findAll();
        model.addAttribute("partnerDetailsList", partnerDetailsList);
        List<SchoolEligibilityLookup> schoolEligibilityLookupList = schoolEligibilityLookupRepository.findAll();
        model.addAttribute("schoolEligibilityLookupList", schoolEligibilityLookupList);
        List<SMSTemplateDetails> smsTemplateDetailsList = smsTemplateDetailsRepository.findAll();
        model.addAttribute("smsTemplateDetailsList", smsTemplateDetailsList);
        List<Lender> lenderList = lenderRepository.findAll();
        model.addAttribute("lenderList", lenderList);
        List<LenderDocuSignConfig> lenderDocuSignConfigList = lenderDocuSignConfigRepository.findAll();
        model.addAttribute("lenderDocuSignConfigList", lenderDocuSignConfigList);
        List<LenderMaxDTILookup> lenderMaxDTILookupList = lenderMaxDTILookupRepository.findAll();
        model.addAttribute("lenderMaxDTILookupList", lenderMaxDTILookupList);
        List<LenderMenu> lenderMenuList = lenderMenuRepository.findAll();
        model.addAttribute("lenderMenuList", lenderMenuList);
        List<LenderSubProduct> lenderSubProductList = lenderSubProductRepository.findAll();
        model.addAttribute("lenderSubProductList", lenderSubProductList);
        return "search";
        //return "CreateInstitutionDetails";
    }

    @GetMapping("save1")
    public String fillInstituitionDetails(Model model) {
        InstitutionDetails institutionDetails = new InstitutionDetails();
        model.addAttribute("institutionDetails", institutionDetails);
        BureauConfigDetails bureauConfigDetails = new BureauConfigDetails();
        model.addAttribute("bureauConfigDetails", bureauConfigDetails);
        InternalAutoInventory internalAutoInventory = new InternalAutoInventory();
        model.addAttribute("internalAutoInventory", internalAutoInventory);
        BackendProductLookUp backendProductLookUp = new BackendProductLookUp();
        model.addAttribute("backendProductLookUp", backendProductLookUp);
        InstitutionCrossProductDetails institutionCrossProductDetails = new InstitutionCrossProductDetails();
        model.addAttribute("institutionCrossProductDetails", institutionCrossProductDetails);
        IPWhiteListing ipWhiteListing = new IPWhiteListing();
        model.addAttribute("ipWhiteListing", ipWhiteListing);
        TaxLookUp taxLookUp = new TaxLookUp();
        model.addAttribute("taxLookUp", taxLookUp);
        EmailTemplateDetails emailTemplateDetails = new EmailTemplateDetails();
        model.addAttribute("emailTemplateDetails", emailTemplateDetails);
        PartnerDetails partnerDetails = new PartnerDetails();
        model.addAttribute("partnerDetails", partnerDetails);
        SchoolEligibilityLookup schoolEligibilityLookup = new SchoolEligibilityLookup();
        model.addAttribute("schoolEligibilityLookup", schoolEligibilityLookup);
        SMSTemplateDetails smsTemplateDetails = new SMSTemplateDetails();
        model.addAttribute("smsTemplateDetails", smsTemplateDetails);
        Lender lender = new Lender();
        model.addAttribute("lender", lender);
        LenderDocuSignConfig lenderDocuSignConfig = new LenderDocuSignConfig();
        model.addAttribute("lenderDocuSignConfig", lenderDocuSignConfig);
        LenderMaxDTILookup lenderMaxDTILookup = new LenderMaxDTILookup();
        model.addAttribute("lenderMaxDTILookup", lenderMaxDTILookup);
        LenderMenu lenderMenu = new LenderMenu();
        model.addAttribute("lenderMenu", lenderMenu);
        LenderSubProduct lenderSubProduct = new LenderSubProduct();
        model.addAttribute("lenderSubProduct", lenderSubProduct);
        return "CreateInstitutionDetails";
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("institutionDetailsList", institutionDetailsRepository.findAll());
        return "search";
    }

    @PostMapping("save/InstituitionDetails")
    public String saveInstituitionDetails(@ModelAttribute("institutionDetails") InstitutionDetails institutionDetails,
                                          @ModelAttribute("bureauConfigDetails") BureauConfigDetails bureauConfigDetails,
                                          @ModelAttribute("internalAutoInventory") InternalAutoInventory internalAutoInventory,
                                          @ModelAttribute("backendProductLookUp") BackendProductLookUp backendProductLookUp,
                                          @ModelAttribute("institutionCrossProductDetails") InstitutionCrossProductDetails institutionCrossProductDetails,
                                          @ModelAttribute("ipWhiteListing") IPWhiteListing ipWhiteListing,
                                          @ModelAttribute("taxLookUp") TaxLookUp taxLookUp,
                                          @ModelAttribute("emailTemplateDetails") EmailTemplateDetails emailTemplateDetails,
                                          @ModelAttribute("partnerDetails") PartnerDetails partnerDetails,
                                          @ModelAttribute("schoolEligibilityLookup") SchoolEligibilityLookup schoolEligibilityLookup,
                                          @ModelAttribute("smsTemplateDetails") SMSTemplateDetails smsTemplateDetails,
                                          @ModelAttribute("lender") Lender lender,
                                          @ModelAttribute("lenderDocuSignConfig") LenderDocuSignConfig lenderDocuSignConfig,
                                          @ModelAttribute("lenderMaxDTILookup") LenderMaxDTILookup lenderMaxDTILookup,
                                          @ModelAttribute("lenderMenu") LenderMenu lenderMenu,
                                          @ModelAttribute("lenderSubProduct") LenderSubProduct lenderSubProduct,
                                          @RequestParam(value = "action", required = true) String action, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "CreateInstitutionDetails";
        }
        if (action.equalsIgnoreCase("institutionDetails")) {
            institutionDetailsRepository.save(institutionDetails);
            model.addAttribute("institutionDetailsList", institutionDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("bureauConfigDetails")) {
            bureauConfigDetailsRepository.save(bureauConfigDetails);
            model.addAttribute("bureauConfigDetailsList", bureauConfigDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("internalAutoInventory")) {
            internalAutoInventoryRepository.save(internalAutoInventory);
            model.addAttribute("internalAutoInventoryList", internalAutoInventoryRepository.findAll());
        }

        if (action.equalsIgnoreCase("backendProductLookUp")) {
            backendProductLookUpRepository.save(backendProductLookUp);
            model.addAttribute("backendProductLookUpList", backendProductLookUp);
        }

        if (action.equalsIgnoreCase("institutionCrossProductDetails")) {
            institutionCrossProductDetailsRepository.save(institutionCrossProductDetails);
            model.addAttribute("institutionCrossProductDetailsList", institutionCrossProductDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("ipWhiteListing")) {
            ipWhiteListingRepository.save(ipWhiteListing);
            model.addAttribute("ipWhiteListingList", ipWhiteListingRepository.findAll());
        }

        if (action.equalsIgnoreCase("taxLookUp")) {
            taxLookUpRepository.save(taxLookUp);
            model.addAttribute("taxLookUpList", taxLookUpRepository.findAll());
        }

        if (action.equalsIgnoreCase("emailTemplateDetails")) {
            emailTemplateDetailsRepository.save(emailTemplateDetails);
            model.addAttribute("emailTemplateDetailsList", emailTemplateDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("partnerDetails")) {
            partnerDetailsRepository.save(partnerDetails);
            model.addAttribute("partnerDetailsList", partnerDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("schoolEligibilityLookup")) {
            schoolEligibilityLookupRepository.save(schoolEligibilityLookup);
            model.addAttribute("schoolEligibilityLookupList", schoolEligibilityLookupRepository.findAll());
        }

        if (action.equalsIgnoreCase("smsTemplateDetails")) {
            smsTemplateDetailsRepository.save(smsTemplateDetails);
            model.addAttribute("smsTemplateDetailsList", smsTemplateDetailsRepository.findAll());
        }

        if (action.equalsIgnoreCase("lender")) {
            lenderRepository.save(lender);
            model.addAttribute("lenderList", lenderRepository.findAll());
        }

        if (action.equalsIgnoreCase("lenderDocuSignConfig")) {
            lenderDocuSignConfigRepository.save(lenderDocuSignConfig);
            model.addAttribute("lenderDocuSignConfigList", lenderDocuSignConfigRepository.findAll());
        }

        if (action.equalsIgnoreCase("lenderMaxDTILookup")) {
            lenderMaxDTILookupRepository.save(lenderMaxDTILookup);
            model.addAttribute("lenderMaxDTILookupList", lenderMaxDTILookupRepository.findAll());
        }

        if (action.equalsIgnoreCase("lenderMenu")) {
            lenderMenuRepository.save(lenderMenu);
            model.addAttribute("lenderMenuList", lenderMenuRepository.findAll());
        }

        if (action.equalsIgnoreCase("lenderSubProduct")) {
            lenderSubProductRepository.save(lenderSubProduct);
            model.addAttribute("lenderSubProductList", lenderSubProductRepository.findAll());
        }
        model.addAttribute("search", new Search());
        return "redirect:/products/show";
    }

//    @RequestMapping(value = "findBy", method = RequestMethod.GET)
//    public String add(Model model) {
//        model.addAttribute("search", new Search());
//        return "search";
//
//    }

    @GetMapping("deleteInstitutionDetails/{id}")
    public String deleteInstitutionDetails(@PathVariable("id") long id, Model model) {
        institutionDetailsRepository.deleteById(id);
        //model.addAttribute("institutionDetailsList", institutionDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteBureauConfigDetails/{id}")
    public String deleteBureauConfigDetails(@PathVariable("id") long id, Model model) {
        bureauConfigDetailsRepository.deleteById(id);
        //model.addAttribute("bureauConfigDetailsList",bureauConfigDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteInternalAutoInventory/{id}")
    public String deleteInternalAutoInventory(@PathVariable("id") long id, Model model) {
        internalAutoInventoryRepository.deleteById(id);
        //model.addAttribute("internalAutoInventoryList",internalAutoInventoryRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteBackendProductLookUp/{id}")
    public String deleteBackendProductLookUp(@PathVariable("id") long id, Model model) {
        backendProductLookUpRepository.deleteById(id);
        //model.addAttribute("backendProductLookUpList",backendProductLookUpRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteInstitutionCrossProductDetails/{id}")
    public String deleteInstitutionCrossProductDetails(@PathVariable("id") long id, Model model) {
        institutionCrossProductDetailsRepository.deleteById(id);
        //model.addAttribute("institutionCrossProductDetailsList",institutionCrossProductDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteIPWhiteListing/{id}")
    public String deleteIPWhiteListing(@PathVariable("id") long id, Model model) {
        ipWhiteListingRepository.deleteById(id);
        //model.addAttribute("ipWhiteListingList",ipWhiteListingRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteTaxLookUp/{id}")
    public String deleteTaxLookUp(@PathVariable("id") long id, Model model) {
        taxLookUpRepository.deleteById(id);
        //model.addAttribute("taxLookUpList",taxLookUpRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteEmailTemplateDetails/{id}")
    public String deleteEmailTemplateDetails(@PathVariable("id") long id, Model model) {
        emailTemplateDetailsRepository.deleteById(id);
        //model.addAttribute("emailTemplateDetailsList",emailTemplateDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deletePartnerDetails/{id}")
    public String deletePartnerDetails(@PathVariable("id") long id, Model model) {
        partnerDetailsRepository.deleteById(id);
        //model.addAttribute("partnerDetailsList",partnerDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteSchoolEligibilityLookup/{id}")
    public String deleteSchoolEligibilityLookup(@PathVariable("id") long id, Model model) {
        schoolEligibilityLookupRepository.deleteById(id);
        //model.addAttribute("schoolEligibilityLookupList",schoolEligibilityLookupRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteSMSTemplateDetails/{id}")
    public String deleteSMSTemplateDetails(@PathVariable("id") long id, Model model) {
        smsTemplateDetailsRepository.deleteById(id);
        //model.addAttribute("smsTemplateDetailsList",smsTemplateDetailsRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteLender/{id}")
    public String deleteLender(@PathVariable("id") long id, Model model) {
        lenderRepository.deleteById(id);
        //model.addAttribute("lenderList",lenderRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteLenderDocuSignConfig/{id}")
    public String deleteLenderDocuSignConfig(@PathVariable("id") long id, Model model) {
        lenderDocuSignConfigRepository.deleteById(id);
        //model.addAttribute("lenderDocuSignConfigList",lenderDocuSignConfigRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteLenderMaxDTILookup/{id}")
    public String deleteLenderMaxDTILookup(@PathVariable("id") long id, Model model) {
        lenderMaxDTILookupRepository.deleteById(id);
        //model.addAttribute("lenderMaxDTILookupList",lenderMaxDTILookupRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteLenderMenu/{id}")
    public String deleteLenderMenu(@PathVariable("id") long id, Model model) {
        lenderMenuRepository.deleteById(id);
        //model.addAttribute("lenderMenuList",lenderMenuRepository.findAll());

        return "redirect:/products/show";
    }

    @GetMapping("deleteLenderSubProduct/{id}")
    public String deleteLenderSubProduct(@PathVariable("id") long id, Model model) {
        lenderSubProductRepository.deleteById(id);
        //model.addAttribute("lenderSubProductList",lenderSubProductRepository.findAll());

        return "redirect:/products/show";
    }



    @GetMapping("findBy")
    public String findByInstituition(@Valid @ModelAttribute("search") Search search, Model model) {
        if(search.getSearchBy().isBlank() || search.getSearchBy().isEmpty())
        {
            return "redirect:/products/show";
        }

        List<InstitutionDetails> institutionDetailsList = institutionDetailsRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("institutionDetailsList", institutionDetailsList);
        List<BureauConfigDetails> bureauConfigDetailsList = bureauConfigDetailsRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("bureauConfigDetailsList", bureauConfigDetailsList);
        List<InternalAutoInventory> internalAutoInventoryList = internalAutoInventoryRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("internalAutoInventoryList", internalAutoInventoryList);
        List<BackendProductLookUp> backendProductLookUpList = backendProductLookUpRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("backendProductLookUpList", backendProductLookUpList);
        List<InstitutionCrossProductDetails> institutionCrossProductDetailsList = institutionCrossProductDetailsRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("institutionCrossProductDetailsList", institutionCrossProductDetailsList);
        List<IPWhiteListing> ipWhiteListingList = ipWhiteListingRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("ipWhiteListingList", ipWhiteListingList);
        List<TaxLookUp> taxLookUpList = taxLookUpRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("taxLookUpList", taxLookUpList);
        List<EmailTemplateDetails> emailTemplateDetailsList = emailTemplateDetailsRepository.findByInstitutionName(search.getSearchBy());
        model.addAttribute("emailTemplateDetailsList", emailTemplateDetailsList);
        List<PartnerDetails> partnerDetailsList = partnerDetailsRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("partnerDetailsList", partnerDetailsList);
        List<SchoolEligibilityLookup> schoolEligibilityLookupList = schoolEligibilityLookupRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("schoolEligibilityLookupList", schoolEligibilityLookupList);
        List<SMSTemplateDetails> smsTemplateDetailsList = smsTemplateDetailsRepository.findByInstitutionName(search.getSearchBy());
        model.addAttribute("smsTemplateDetailsList", smsTemplateDetailsList);
        List<Lender> lenderList = lenderRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("lenderList", lenderList);
        List<LenderDocuSignConfig> lenderDocuSignConfigList = lenderDocuSignConfigRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("lenderDocuSignConfigList", lenderDocuSignConfigList);
        List<LenderMaxDTILookup> lenderMaxDTILookupList = lenderMaxDTILookupRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("lenderMaxDTILookupList", lenderMaxDTILookupList);
        List<LenderMenu> lenderMenuList = lenderMenuRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("lenderMenuList", lenderMenuList);
        List<LenderSubProduct> lenderSubProductList = lenderSubProductRepository.findByInstitutionCode(search.getSearchBy());
        model.addAttribute("lenderSubProductList", lenderSubProductList);
        return "search";
    }

    @GetMapping("exports")
    public void exportToExcel(HttpServletResponse response) {
        response.setContentType("application/octet-stream");
        String headerKey = "Content-Disposition";
        String headerValue = "attachement; filename = users.xlsx";
        response.setHeader(headerKey,headerValue);

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


    }
}
