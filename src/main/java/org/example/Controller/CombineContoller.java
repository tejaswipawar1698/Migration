package org.example.Controller;

import org.example.entity.*;
import org.example.repository.primary.*;
import org.example.repository.secondary.*;
import org.example.service.PrimaryDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@ComponentScan
public class CombineContoller {

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    ActionRepository actionRepository;

    @Autowired
    SecondaryClientExternalRoundMappingRepository secondaryClientExternalRoundMappingRepository;

    @Autowired
    SecondaryCompanyInfoRepository secondaryCompanyInfoRepository;

    @Autowired
    SecondaryDocumentConfigRepository secondaryDocumentConfigRepository;

    @Autowired
    SecondaryDocumentKitRepository secondaryDocumentKitRepository;

    @Autowired
    SecondaryEmailTemplateConfigRepository secondaryEmailTemplateConfigRepository;

    @Autowired
    SecondaryFieldGroupMembersRepository secondaryFieldGroupMembersRepository;

    @Autowired
    SecondaryFormLabelsRepository secondaryFormLabelsRepository;

    @Autowired
    SecondaryPermissionMstrRepository secondaryPermissionMstrRepository;

    @Autowired
    SecondaryReasonMstrRepository secondaryReasonMstrRepository;

    @Autowired
    SecondaryRequestStatusMstrRepository secondaryRequestStatusMstrRepository;

    @Autowired
    SecondarySocialChannelConfigRepository secondarySocialChannelConfigRepository;

    @Autowired
    SecondaryStaticFileMstrRepository secondaryStaticFileMstrRepository;

    @Autowired
    SecondaryTemplateMstrRepository secondaryTemplateMstrRepository;

    @Autowired
    SecondaryUserRoleRepository secondaryUserRoleRepository;

    @Autowired
    SecondaryValidatorsMstrRepository secondaryValidatorsMstrRepository;

    @Autowired
    SecondaryVendorMstrRepository secondaryVendorMstrRepository;

    @Autowired
    SecondaryFieldMemberPersistMstrRepository secondaryFieldMemberPersistMstrRepository;

    @Autowired
    SecondaryDocumentKitFormLabelsRepository secondaryDocumentKitFormLabelsRepository;

    @Autowired
    SecondaryDocumentKitFieldGroupsRepository secondaryDocumentKitFieldGroupsRepository;

    @Autowired
    SecondaryDocumentKitFieldGroupsFieldMemberMapRepository secondaryDocumentKitFieldGroupsFieldMemberMapRepository;

    @Autowired
    SecondaryUserRolePermissionRepository secondaryUserRolePermissionRepository;

    @Autowired
    SecondaryTemplateOptionsRepository secondaryTemplateOptionsRepository;

    @Autowired
    SecondaryRequestVerificationConfigRepository secondaryRequestVerificationConfigRepository;

    @Autowired
    SecondaryRequestTransitionMstrRepository secondaryRequestTransitionMstrRepository;

    @Autowired
    SecondaryReasonMstrTranslationRepository secondaryReasonMstrTranslationRepository;

    @Autowired
    SecondaryFieldMemberValidationMessageRepository secondaryFieldMemberValidationMessageRepository;

    @Autowired
    SecondaryOptionsRepository secondaryOptionsRepository;

    @Autowired
    PrimaryDBService primaryDBService;

    @Autowired
    PrimaryFieldGroupMembersRepository primaryFieldGroupMembersRepository;

    @Autowired
    PrimaryDocumentKitRepository primaryDocumentKitRepository;

    @Autowired
    PrimaryFormLabelsRepository primaryFormLabelsRepository;

    @Autowired
    PrimaryCompanyMstrRepository primaryCompanyMstrRepository;

    @Autowired
    PrimaryDocumentKitFormLabelsRepository primaryDocumentKitFormLabelsRepository;

    @Autowired
    PrimaryUserRoleRepository primaryUserRoleRepository;

    @Autowired
    PrimaryPermissionMstrRepository primaryPermissionMstrRepository;

    @Autowired
    PrimaryReasonMstrRepository primaryReasonMstrRepository;

    @Autowired
    ActionMstrRepository actionMstrRepository;

    @Autowired
    PrimaryValidatorsMstrRepository primaryValidatorsMstrRepository;

    @Autowired
    PrimaryOptionsRepository primaryOptionsRepository;


    @RequestMapping(value = "/{companyCd}", method= RequestMethod.GET)
    public CompanyMstr getResponse(@PathVariable String companyCd)
    {
        CompanyMstr companyMstr=primaryDBService.fetchCompanyMsTRSeq(companyCd);
        Long companyMstrSeq= Long.valueOf(companyMstr.getCompanyMstrSeq());

        Optional<CompanyMstr> companyMstr1=primaryCompanyMstrRepository.findById(companyMstrSeq);
        CompanyMstr companyMstr2=primaryDBService.fetchSecondaryCompanyMstr(companyMstr1.get().getCompanyCd());

       // List<CardsMstr> output = primaryDBService.fetchDetails(companyMstrSeq, 'A');
        List<ActionsMstr> output2= primaryDBService.fetchActionMstr(companyMstrSeq,'A');
        /*List<ClientExternalRoundMapping> clientExternalRoundMappings=primaryDBService.fetchClientExternalRoundMapping(companyMstrSeq,'A');
        List<CompanyInfo> companyInfos=primaryDBService.fetchCompanyInfo(Long.valueOf(companyMstrSeq),'A');
        List<DocumentConfig> documentConfigs=primaryDBService.fetchDocumentConfig(companyMstrSeq,'A');*/
        //List<DocumentKit> documentKits=primaryDBService.fetchDocumentKit(companyMstrSeq,'A');
        //List<EmailTemplateConfig> emailTemplateConfigs=primaryDBService.fetchEmailTemplateConfig(companyMstrSeq,'A');
        //List<FieldGroupMembers> fieldGroupMembers=primaryDBService.fetchFieldGroupMembers(companyMstrSeq,'A');
        //List<FormLabels> formLabels=primaryDBService.fetchFormLabels(companyMstrSeq,'A');
        //List<PermissionMstr> permissionMstrs=primaryDBService.fetchPermissionMstr(companyMstrSeq,'A');
        //List<ReasonMstr> reasonMstrs=primaryDBService.fetchReasonMstr(companyMstrSeq,'A');
        List<RequestStatusMstr> requestStatusMstrs=primaryDBService.fetchRequestStatusMstr(companyMstrSeq,'A');
        /*List<SocialChannelConfig> socialChannelConfigs=primaryDBService.fetchSocialChannelConfig(companyMstrSeq,'A');
        List<StaticFileMstr> staticFileMstrs=primaryDBService.fetchStaticFileMstr(companyMstrSeq,'A');
        List<TemplateMstr> templateMstrs=primaryDBService.fetchTemplateMstr(companyMstrSeq,'A');*/
        List<UserRole> userRoles=primaryDBService.fetchUserRole(companyMstrSeq,'A');
        List<ValidatorsMstr> validatorsMstrs=primaryDBService.fetchValidatorMstr(companyMstrSeq,'A');
        //List<VendorMstr> vendorMstrs=primaryDBService.fetchVendorMstr(companyMstrSeq,'A');
        List<Options> options=primaryDBService.fetchOptions(companyMstrSeq,'A');

        //List<FieldMemberPersistMstr> fieldMemberPersistMstrs=primaryDBService.fetchFieldMemberPersistMstr(companyMstrSeq,'A');
        //List<DocumentKitFormLabels>  documentKitFormLabels=primaryDBService.fetchDocumentKitFormLabels(companyMstrSeq,'A');
        //List<DocumentKitFieldGroups> documentKitFieldGroups=primaryDBService.fetchDocumentKitFieldGroups(companyMstrSeq,'A');
        //List<DocumentKitFieldGroupsFieldMemberMap> documentKitFieldGroupsFieldMemberMaps=primaryDBService.fetchDocumentKitFieldGroupsFieldMemberMap(companyCd,'A');
        //List<UserRolePermissions> userRolePermissions=primaryDBService.fetchUserRolePermission(companyMstrSeq,'A');
        //List<TemplateOptions> templateOptions=primaryDBService.fetchTemplateOption(companyMstrSeq,'A');
        List<RequestVerificationConfig> requestVerificationConfigs=primaryDBService.fetchRequestVerificationConfig(companyMstrSeq,'A');
        List<ReasonMstrTranslation> reasonMstrTranslations=primaryDBService.fetchReasonMstrTranslation(companyMstrSeq,'A');
        List<RequestTransitionMstr> requestTransitionMstrs=primaryDBService.fetchRequestTransitionMstr(companyMstrSeq,'A');
        List<FieldMemberValidationMessageMap> fieldMemberValidationMessageMaps=primaryDBService.fetchFieldMemberValidationMessageMap(companyMstrSeq,'A');
        List<OptionsTemplateOptionsMap> optionsTemplateOptionsMaps=primaryDBService.fetchOptionsTemplateOptionsMap(companyMstrSeq,'A');


        /*output.forEach(e->{
            e.setCardMstrSeq(null);
        });
        managerRepository.saveAll(output);*/

        /*output2.forEach(f->{
            f.setActionSeq(null);
            f.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
        });
        actionRepository.saveAll(output2);*/

        /*clientExternalRoundMappings.forEach(clientExternalRoundMapping -> {
            clientExternalRoundMapping.setClientExternalRoundMappingSeq(null);
        });
        secondaryClientExternalRoundMappingRepository.saveAll(clientExternalRoundMappings);

        companyInfos.forEach(companyInfo -> {
            companyInfo.setCompanyInfoSeq(null);
        });
        secondaryCompanyInfoRepository.saveAll(companyInfos);

        documentConfigs.forEach(documentConfig -> {
            documentConfig.setDocumentConfigSeq(null);
        });
        secondaryDocumentConfigRepository.saveAll(documentConfigs);*/

        /*documentKits.forEach(documentKit -> {
            documentKit.setDocumentKitSeq(null);
            documentKit.setCompanyMstrSeq(Long.valueOf(companyMstr2.getCompanyMstrSeq()));
        });
        secondaryDocumentKitRepository.saveAll(documentKits);

        formLabels.forEach(formLabels1 -> {
            formLabels1.setFormLabelSeq(null);
            formLabels1.setCompanyMstrSeq(Long.valueOf(companyMstr2.getCompanyMstrSeq()));
            secondaryFormLabelsRepository.saveAll(formLabels);
        });*/
        /*emailTemplateConfigs.forEach(emailTemplateConfig -> {
            emailTemplateConfig.setEmailTemplateConfigSeq(null);
        });
        secondaryEmailTemplateConfigRepository.saveAll(emailTemplateConfigs);*/

        options.forEach(options1 -> {
            options1.setOptionSeq(null);
            options1.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            secondaryOptionsRepository.save(options1);
        });

        optionsTemplateOptionsMaps.forEach(optionsTemplateOptionsMap -> {
            Optional<Options> options1=primaryOptionsRepository.findById(optionsTemplateOptionsMap.getOptions());
            List<Options> options2=primaryDBService.fetchSecondaryOptions(companyMstr2.getCompanyMstrSeq(),options1.get().getValue(),options1.get().getClientCd(),'A');
            
        });


        /*fieldGroupMembers.forEach(fieldGroupMembers1 -> {
            fieldGroupMembers1.setFieldGroupMemberSeq(null);
            secondaryFieldGroupMembersRepository.save(fieldGroupMembers1);
        });

        for (FieldMemberPersistMstr fieldMemberPersistMstr:fieldMemberPersistMstrs)
        {
            Optional<FieldGroupMembers> fieldGroupMembers1=primaryFieldGroupMembersRepository.findById(fieldMemberPersistMstr.getFieldGroupMembers());
            List<FieldGroupMembers> fieldGroupMembersList=primaryDBService.fetchSecondaryFieldKey(companyMstrSeq,fieldGroupMembers1.get().getFieldKey(),'A');
            fieldMemberPersistMstr.setFieldGroupMembers(fieldGroupMembersList.get(0).getFieldGroupMemberSeq());
            secondaryFieldMemberPersistMstrRepository.save(fieldMemberPersistMstr);
        }*/

        /*validatorsMstrs.forEach(validatorsMstr -> {
            validatorsMstr.setValidatorMstrSeq(null);
            validatorsMstr.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
        });
        secondaryValidatorsMstrRepository.saveAll(validatorsMstrs);

        fieldMemberValidationMessageMaps.forEach(fieldMemberValidationMessageMap -> {
            Optional<FieldGroupMembers> fieldGroupMembers1=primaryFieldGroupMembersRepository.findById(fieldMemberValidationMessageMap.getFieldGroupMembers());
            List<FieldGroupMembers> fieldGroupMembersList=primaryDBService.fetchSecondaryFieldKey(companyMstrSeq,fieldGroupMembers1.get().getFieldKey(),'A');
            Optional<ValidatorsMstr> validatorsMstrList=primaryValidatorsMstrRepository.findById(Long.valueOf(fieldMemberValidationMessageMap.getValidatorMstr()));
            List<ValidatorsMstr> validatorsMstrs1=primaryDBService.fetchSecondaryValidatorMstr(companyMstr2.getCompanyMstrSeq(),validatorsMstrList.get().getValidation(),'A');
            fieldMemberValidationMessageMap.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            fieldMemberValidationMessageMap.setFieldGroupMembers(fieldGroupMembersList.get(0).getFieldGroupMemberSeq());
            fieldMemberValidationMessageMap.setValidatorMstr(Long.valueOf(validatorsMstrs1.get(0).getValidatorMstrSeq()));
            secondaryFieldMemberValidationMessageRepository.save(fieldMemberValidationMessageMap);
        });*/

       /* for (DocumentKitFormLabels documentKitFormLabels1:documentKitFormLabels)
        {
            Optional<DocumentKit> documentKit=primaryDocumentKitRepository.findById(documentKitFormLabels1.getDocumentKit());
            Optional<FormLabels> formLabels2=primaryFormLabelsRepository.findById(documentKitFormLabels1.getFormLabels());
            List<DocumentKit> documentKits2=primaryDBService.fetchSecondaryDocumentKit(documentKit.get().getCompanyMstrSeq(),documentKit.get().getDocumentKitCd(),'A');
            List<FormLabels> formLabels1=primaryDBService.fetchSecondaryFormLabels(formLabels2.get().getCompanyMstrSeq(), formLabels2.get().getLabel(),'A');
            documentKitFormLabels1.setDocumentKit(documentKits2.get(0).getDocumentKitSeq());
            documentKitFormLabels1.setFormLabels(formLabels1.get(0).getFormLabelSeq());
            documentKitFormLabels1.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            secondaryDocumentKitFormLabelsRepository.save(documentKitFormLabels1);

        }*/

        /*for (DocumentKitFieldGroups documentKitFieldGroups1:documentKitFieldGroups)
        {
            Optional<DocumentKitFormLabels> documentKitFormLabels1=primaryDocumentKitFormLabelsRepository.findById(documentKitFieldGroups1.getDocumentKitFormLabels().getDocumentKitLabelSeq());
            Optional<DocumentKit> documentKit=primaryDocumentKitRepository.findById(documentKitFieldGroups1.getDocumentKitFieldGroupSeq());
            List<DocumentKitFormLabels> documentKitFormLabels2=primaryDBService.fetchSecondaryDocumentFormLabels(documentKitFormLabels1.get().getDocumentKitLabelSeq(),'A');

        }*/

        /*permissionMstrs.forEach(permissionMstr -> {
            permissionMstr.setPermissionSeq(null);
            permissionMstr.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
        });
        secondaryPermissionMstrRepository.saveAll(permissionMstrs);*/

       /* reasonMstrs.forEach(reasonMstr -> {
            reasonMstr.setReasonMstrSeq(null);
            reasonMstr.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
        });
        secondaryReasonMstrRepository.saveAll(reasonMstrs);*/


       /* socialChannelConfigs.forEach(socialChannelConfig -> {
            socialChannelConfig.setSocialChannelConfigSeq(null);
        });
        secondarySocialChannelConfigRepository.saveAll(socialChannelConfigs);

        staticFileMstrs.forEach(staticFileMstr -> {
            staticFileMstr.setStaticFileMstrSeq(null);
        });
        secondaryStaticFileMstrRepository.saveAll(staticFileMstrs);

        templateMstrs.forEach(templateMstr -> {
            templateMstr.setTemplateMstrSeq(null);
        });
        secondaryTemplateMstrRepository.saveAll(templateMstrs);*/

        /*userRoles.forEach(userRole -> {
            userRole.setUserRoleSeq(null);
            userRole.setCompanyMstrSeq(Long.valueOf(companyMstr2.getCompanyMstrSeq()));
        });
        secondaryUserRoleRepository.saveAll(userRoles);*/

      /*  vendorMstrs.forEach(vendorMstr -> {
            vendorMstr.setVendorMstrSeq(null);
        });
        secondaryVendorMstrRepository.saveAll(vendorMstrs);*/

       /* documentKitFieldGroups.forEach(documentKitFieldGroups1 -> {
            documentKitFieldGroups1.setDocumentKitFieldGroupSeq(null);
        });
        secondaryDocumentKitFieldGroupsRepository.saveAll(documentKitFieldGroups);

        documentKitFieldGroupsFieldMemberMaps.forEach(documentKitFieldGroupsFieldMemberMap -> {
            documentKitFieldGroupsFieldMemberMap.setDocumentKitFieldGroupFieldMemberMapSeq(null);
        });
        secondaryDocumentKitFieldGroupsFieldMemberMapRepository.saveAll(documentKitFieldGroupsFieldMemberMaps);*/

        //new column to be added in reason_mstr
        /*reasonMstrTranslations.forEach(reasonMstrTranslation -> {
            Optional<ReasonMstr> reasonMstr=primaryReasonMstrRepository.findById(reasonMstrTranslation.getReasonMstr());
            List<ReasonMstr> reasonMstrs1=primaryDBService.fetchSecondaryReasonMstr(companyMstr2.getCompanyMstrSeq(),reasonMstr.get().getType(),'A');
            reasonMstrTranslation.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            reasonMstrTranslation.setReasonMstrSeq(reasonMstrs1.get(0).getReasonMstrSeq());
            secondaryReasonMstrTranslationRepository.save(reasonMstrTranslation);
        });*/

        /*Map<Long,String> sourceUserRole=new HashMap<>();
        Map<String,Long> destinationRole=new HashMap<>();
        List<UserRole> userRole1=primaryDBService.fetchSecondaryUserRole(companyMstr2.getCompanyMstrSeq(),'A');
        for (UserRole userRole:userRoles) {
           sourceUserRole.put(userRole.getUserRoleSeq(),userRole.getUserRoleCd());
        }
        for (UserRole userRole:userRole1)
        {
            destinationRole.put(userRole.getUserRoleCd(),userRole.getUserRoleSeq());
        }
        requestVerificationConfigs.forEach(requestVerificationConfig -> {
            requestVerificationConfig.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            requestVerificationConfig.setUserRole(destinationRole.get(sourceUserRole.get(requestVerificationConfig.getUserRole())));
            requestVerificationConfig.setPreviousUserRole(destinationRole.get(sourceUserRole.get(requestVerificationConfig.getPreviousUserRole())));
            requestVerificationConfig.setNextUserRole(destinationRole.get(sourceUserRole.get(requestVerificationConfig.getNextUserRole())));
            secondaryRequestVerificationConfigRepository.save(requestVerificationConfig);
        });*/


        /*requestStatusMstrs.forEach(requestStatusMstr -> {
            requestStatusMstr.setRequestStatusMstrSeq(null);
            requestStatusMstr.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
        });
        secondaryRequestStatusMstrRepository.saveAll(requestStatusMstrs);

        Map<Long,String> sourceRequestStatusMstr=new HashMap<>();
        Map<String,Long> destinationRequestStatusMstr=new HashMap<>();
        List<RequestStatusMstr> requestStatusMstrs1=primaryDBService.fetchSecondaryRequestStatusMstr(companyMstr2.getCompanyMstrSeq(),'A');
        for (RequestStatusMstr requestStatusMstr:requestStatusMstrs)
        {
            sourceRequestStatusMstr.put(requestStatusMstr.getRequestStatusMstrSeq(),requestStatusMstr.getRequestCd());
        }
        for (RequestStatusMstr requestStatusMstr:requestStatusMstrs1)
        {
            destinationRequestStatusMstr.put(requestStatusMstr.getRequestCd(),requestStatusMstr.getRequestStatusMstrSeq());
        }
        requestTransitionMstrs.forEach(requestTransitionMstr -> {
            Optional<ActionsMstr> actionsMstr=actionMstrRepository.findById(requestTransitionMstr.getActionsMstr());
            List<ActionsMstr> actionsMstrs=primaryDBService.fetchSecondaryActionMstr(companyMstr2.getCompanyMstrSeq(),actionsMstr.get().getActionCd(),'A');
            requestTransitionMstr.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            requestTransitionMstr.setActionsMstr(actionsMstrs.get(0).getActionSeq());
            requestTransitionMstr.setCurrentRequestStatus(destinationRequestStatusMstr.get(sourceRequestStatusMstr.get(requestTransitionMstr.getCurrentRequestStatus())));
            requestTransitionMstr.setNextRequestStatus(destinationRequestStatusMstr.get(sourceRequestStatusMstr.get(requestTransitionMstr.getNextRequestStatus())));
            secondaryRequestTransitionMstrRepository.save(requestTransitionMstr);
        });*/


        /*templateOptions.forEach(templateOptions1 -> {
            Optional<FieldGroupMembers> fieldGroupMembers1=primaryFieldGroupMembersRepository.findById(templateOptions1.getFieldGroupMembers());
            List<FieldGroupMembers> fieldGroupMembersList=primaryDBService.fetchSecondaryFieldKey(companyMstrSeq,fieldGroupMembers1.get().getFieldKey(),'A');
            templateOptions1.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            templateOptions1.setFieldGroupMembers(fieldGroupMembersList.get(0).getFieldGroupMemberSeq());
            secondaryTemplateOptionsRepository.save(templateOptions1);
        });*/


        /*for (UserRolePermissions userRolePermissions1:userRolePermissions)
        {
            Optional<PermissionMstr> permissionMstr=primaryPermissionMstrRepository.findById(userRolePermissions1.getPermissionSeq());
            List<PermissionMstr> permissionMstr1=primaryDBService.fetchSecondaryPermissionMstr(companyMstr2.getCompanyMstrSeq(),permissionMstr.get().getPermissionCd(),'A');
            userRolePermissions1.setCompanyMstrSeq(companyMstr2.getCompanyMstrSeq());
            userRolePermissions1.setPermissionSeq(permissionMstr1.get(0).getPermissionSeq());
            secondaryUserRolePermissionRepository.save(userRolePermissions1);
        }*/

        return companyMstr;
    }


}
