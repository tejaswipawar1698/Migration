package org.example.service;

import org.example.entity.*;
import org.example.repository.primary.*;
import org.example.repository.secondary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimaryDBService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    ActionMstrRepository actionMstrRepository;

    @Autowired
    PrimaryClientExternalRoundMappingRepository primaryClientExternalRoundMappingRepository;

    @Autowired
    PrimaryCompanyInfoRepository primaryCompanyInfoRepository;

    @Autowired
    PrimaryDocumentConfigRepository primaryDocumentConfigRepository;

    @Autowired
    PrimaryDocumentKitRepository primaryDocumentKitRepository;

    @Autowired
    PrimaryEmailTemplateConfigRepository primaryEmailTemplateConfigRepository;

    @Autowired
    PrimaryFieldGroupMembersRepository primaryFieldGroupMembersRepository;

    @Autowired
    PrimaryFormLabelsRepository primaryFormLabelsRepository;

    @Autowired
    PrimaryPermissionMstrRepository primaryPermissionMstrRepository;

    @Autowired
    PrimaryReasonMstrRepository primaryReasonMstrRepository;

    @Autowired
    PrimaryRequestStatusMstrRepository primaryRequestStatusMstrRepository;

    @Autowired
    PrimarySocialChannelConfigRepository primarySocialChannelConfigRepository;

    @Autowired
    PrimaryStaticFileMstrRepository primaryStaticFileMstrRepository;

    @Autowired
    PrimaryTemplateMstrRepository primaryTemplateMstrRepository;

    @Autowired
    PrimaryUserRoleRepository primaryUserRoleRepository;

    @Autowired
    PrimaryValidatorsMstrRepository primaryValidatorsMstrRepository;

    @Autowired
    PrimaryVendorMstrRepository primaryVendorMstrRepository;

    @Autowired
    PrimaryFieldMemberPersistMstrRepository primaryFieldMemberPersistMstrRepository;

    @Autowired
    PrimaryDocumentKitFormLabelsRepository primaryDocumentKitFormLabelsRepository;

    @Autowired
    PrimaryDocumentKitFieldGroupsRepository primaryDocumentKitFieldGroupsRepository;

    @Autowired
    PrimaryDocumentKitFieldGroupsFieldMemberMapRepository primaryDocumentKitFieldGroupsFieldMemberMapRepository;

    @Autowired
    PrimaryCompanyMstrRepository primaryCompanyMstrRepository;

    @Autowired
    PrimaryUserRolePermissionRepository primaryUserRolePermissionRepository;

    @Autowired
    PrimaryTemplateOptionsRepository primaryTemplateOptionsRepository;

    @Autowired
    PrimaryRequestVerificationConfigRepository primaryRequestVerificationConfigRepository;

    @Autowired
    PrimaryReasonMstrTranslationRepository primaryReasonMstrTranslationRepository;

    @Autowired
    PrimaryRequestTransitionMstrRepository primaryRequestTransitionMstrRepository;

    @Autowired
    PrimaryFieldMemberValidationMessageRepository primaryFieldMemberValidationMessageRepository;

    @Autowired
    PrimaryOptionsRepository primaryOptionsRepository;

    @Autowired
    PrimaryOptionsTemplateOptionsMapRepository primaryOptionsTemplateOptionsMapRepository;

    @Autowired
    SecondaryFieldGroupMembersRepository secondaryFieldGroupMembersRepository;

    @Autowired
    SecondaryDocumentKitRepository secondaryDocumentKitRepository;

    @Autowired
    SecondaryFormLabelsRepository secondaryFormLabelsRepository;

    @Autowired
    SecondaryCompanyMstrRepository secondaryCompanyMstrRepository;

    @Autowired
    SecondaryDocumentKitFormLabelsRepository secondaryDocumentKitFormLabelsRepository;

    @Autowired
    SecondaryPermissionMstrRepository secondaryPermissionMstrRepository;

    @Autowired
    SecondaryUserRoleRepository secondaryUserRoleRepository;

    @Autowired
    SecondaryReasonMstrRepository secondaryReasonMstrRepository;

    @Autowired
    ActionRepository actionRepository;

    @Autowired
    SecondaryRequestStatusMstrRepository secondaryRequestStatusMstrRepository;

    @Autowired
    SecondaryOptionsRepository secondaryOptionsRepository;

    @Autowired
    SecondaryValidatorsMstrRepository secondaryValidatorsMstrRepository;

    public List<CardsMstr> fetchDetails(Integer companyMstrSeq, Character status)
    {
        return employeeRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
        
    }

    public List<ActionsMstr> fetchActionMstr(Long companyMstrSeq, Character status)
    {
        return actionMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);

    }

    public List<ClientExternalRoundMapping> fetchClientExternalRoundMapping(Integer companyMstrSeq,Character status)
    {
        return primaryClientExternalRoundMappingRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<CompanyInfo> fetchCompanyInfo(Long companyMstrSeq, Character status)
    {
        return  primaryCompanyInfoRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<DocumentConfig> fetchDocumentConfig(Long companyMstrSeq, Character status)
    {
        return primaryDocumentConfigRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<DocumentKit> fetchDocumentKit(Long companyMstrSeq,Character status)
    {
        return primaryDocumentKitRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<EmailTemplateConfig> fetchEmailTemplateConfig(Long companyMstrSeq,Character status)
    {
        return primaryEmailTemplateConfigRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<FieldGroupMembers> fetchFieldGroupMembers(Long companyMstrSeq, Character status)
    {
        return primaryFieldGroupMembersRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<FormLabels> fetchFormLabels(Long companyMstrSeq,Character status)
    {
        return primaryFormLabelsRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<PermissionMstr> fetchPermissionMstr(Long companyMstr,Character status)
    {
        return primaryPermissionMstrRepository.findByCompanyMstrSeqAndStatus(companyMstr,status);
    }

    public List<ReasonMstr> fetchReasonMstr(Long companyMstrSeq,Character status)
    {
        return primaryReasonMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<RequestStatusMstr> fetchRequestStatusMstr(Long companyMstrSeq,Character status)
    {
        return primaryRequestStatusMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<SocialChannelConfig> fetchSocialChannelConfig(Long companyMstrSeq,Character status)
    {
        return primarySocialChannelConfigRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<StaticFileMstr> fetchStaticFileMstr(Long companyMstrSeq,Character status)
    {
        return primaryStaticFileMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<TemplateMstr> fetchTemplateMstr(Long companyMstrSeq,Character status)
    {
        return primaryTemplateMstrRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<UserRole> fetchUserRole(Long companyMstrSeq,Character status)
    {
        return primaryUserRoleRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<ValidatorsMstr> fetchValidatorMstr(Long companyMstrSeq,Character status)
    {
        return primaryValidatorsMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<VendorMstr> fetchVendorMstr(Long companyMstrSeq,Character status)
    {
        return primaryVendorMstrRepository.findAllByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

   /* public DocumentKit fetchDocumentKitSeq(Long companyMstrSeq, String documentKitCd, Character status)
    {
        return primaryDocumentKitRepository.findByCompanyMstrSeqAndDocumentKitCdAndStatus(companyMstrSeq,documentKitCd,status);
    }*/

    public List<FieldMemberPersistMstr> fetchFieldMemberPersistMstr(Long companyMstrSeq,Character status)
    {
        return primaryFieldMemberPersistMstrRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq,status);
    }

    public List<DocumentKitFieldGroups> fetchDocumentKitFieldGroups(Long companyMstrSeq, Character status)
    {
        return primaryDocumentKitFieldGroupsRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<DocumentKitFieldGroupsFieldMemberMap> fetchDocumentKitFieldGroupsFieldMemberMap(String companyCd,Character status)
    {
        return  primaryDocumentKitFieldGroupsFieldMemberMapRepository.findByCompanyMstrSeqAndStatus(companyCd, status);
    }

    public CompanyMstr fetchCompanyMsTRSeq(String companyCd)
    {
        return primaryCompanyMstrRepository.findByCompanyCd(companyCd);
    }

    public List<FieldGroupMembers> fetchSecondaryFieldGroupMembers(Long companyMstrSeq, Character status)
    {
        return secondaryFieldGroupMembersRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<FieldGroupMembers> fetchSecondaryFieldKey(Long companyMstrSeq,String fieldKey, Character status)
    {
        return secondaryFieldGroupMembersRepository.findByCompanyMstrSeqAndFieldKeyAndStatus(companyMstrSeq,fieldKey,status);
    }

    public List<DocumentKitFormLabels> fetchDocumentKitFormLabels(Long companyMstrSeq,Character status)
    {
        return primaryDocumentKitFormLabelsRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<DocumentKit> fetchSecondaryDocumentKit(Long companyMstrSeq,String documentKitCd,Character status)
    {
        return secondaryDocumentKitRepository.findByCompanyMstrSeqAndDocumentKitCdAndStatus(companyMstrSeq, documentKitCd, status);
    }

    public List<FormLabels> fetchSecondaryFormLabels(Long companyMstrSeq, String label, Character status)
    {
        return secondaryFormLabelsRepository.findByCompanyMstrSeqAndLabelAndStatus(companyMstrSeq, label, status);
    }

    public CompanyMstr fetchSecondaryCompanyMstr(String companyCd)
    {
        return secondaryCompanyMstrRepository.findByCompanyCd(companyCd);
    }

    public List<DocumentKitFormLabels> fetchSecondaryDocumentFormLabels(Long documentKItLabelSeq,Character status)
    {
        return secondaryDocumentKitFormLabelsRepository.findByDocumentKitLabelSeqAndStatus(documentKItLabelSeq, status);
    }

    public List<UserRolePermissions> fetchUserRolePermission(Long companyMstrSeq,Character status)
    {
        return primaryUserRolePermissionRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<PermissionMstr> fetchSecondaryPermissionMstr(Long comapnyMstrSeq,String permissionCd,Character status)
    {
        return secondaryPermissionMstrRepository.findByCompanyMstrSeqAndPermissionCdAndStatus(comapnyMstrSeq, permissionCd, status);
    }

    public List<TemplateOptions> fetchTemplateOption(Long companyMstrSeq,Character status)
    {
        return primaryTemplateOptionsRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<RequestVerificationConfig> fetchRequestVerificationConfig(Long companyMstrSeq,Character status)
    {
        return primaryRequestVerificationConfigRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<UserRole> fetchSecondaryUserRole(Long companyMstrSeq,Character status)
    {
        return secondaryUserRoleRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<ReasonMstrTranslation> fetchReasonMstrTranslation(Long companyMstrSeq,Character status)
    {
        return primaryReasonMstrTranslationRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<ReasonMstr> fetchSecondaryReasonMstr(Long companyMstrSeq,String type,Character status)
    {
        return secondaryReasonMstrRepository.findByCompanyMstrSeqAndTypeAndStatus(companyMstrSeq, type, status);
    }

    public List<RequestTransitionMstr> fetchRequestTransitionMstr(Long companyMstrSeq,Character status)
    {
        return primaryRequestTransitionMstrRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<ActionsMstr> fetchSecondaryActionMstr(Long companyMstrSeq,String actionCd,Character status)
    {
        return actionRepository.findByCompanyMstrSeqAndActionCdAndStatus(companyMstrSeq, actionCd, status);
    }

    public List<RequestStatusMstr> fetchSecondaryRequestStatusMstr(Long companyMstrSeq, Character status)
    {
        return secondaryRequestStatusMstrRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<FieldMemberValidationMessageMap> fetchFieldMemberValidationMessageMap(Long companyMstrSeq,Character status)
    {
        return  primaryFieldMemberValidationMessageRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<ValidatorsMstr> fetchSecondaryValidatorMstr(Long companyMstrSeq,String validation,Character status)
    {
        return secondaryValidatorsMstrRepository.findByCompanyMstrSeqAndValidationAndStatus(companyMstrSeq, validation, status);
    }

    public List<Options> fetchOptions(Long companyMstrSeq,Character status)
    {
        return primaryOptionsRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<OptionsTemplateOptionsMap> fetchOptionsTemplateOptionsMap(Long companyMstrSeq,Character status)
    {
        return primaryOptionsTemplateOptionsMapRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

    public List<Options> fetchSecondaryOptions(Long companyMstrSeq,String value,String clientCd,Character status)
    {
        return secondaryOptionsRepository.findByCompanyMstrSeqAndValueAndClientCdAndStatus(companyMstrSeq, value, clientCd, status);
    }
}
