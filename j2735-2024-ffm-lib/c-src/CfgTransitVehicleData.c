/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ProbeDataConfig"
 * 	found in "asn/J2945-C-ProbeDataConfig-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "CfgTransitVehicleData.h"

asn_TYPE_member_t asn_MBR_CfgTransitVehicleData_1[] = {
	{ ATF_POINTER, 3, offsetof(struct CfgTransitVehicleData, currNumPasngers),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_BOOLEAN,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"currNumPasngers"
		},
	{ ATF_POINTER, 2, offsetof(struct CfgTransitVehicleData, avgNumPasngers),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_BOOLEAN,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"avgNumPasngers"
		},
	{ ATF_POINTER, 1, offsetof(struct CfgTransitVehicleData, trnstVehSchAdh),
		(ASN_TAG_CLASS_CONTEXT | (2 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_BOOLEAN,
		0,
		{
#if !defined(ASN_DISABLE_OER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
			0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
			0
		},
		0, 0, /* No default value */
		"trnstVehSchAdh"
		},
};
static const int asn_MAP_CfgTransitVehicleData_oms_1[] = { 0, 1, 2 };
static const ber_tlv_tag_t asn_DEF_CfgTransitVehicleData_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_CfgTransitVehicleData_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* currNumPasngers */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 }, /* avgNumPasngers */
    { (ASN_TAG_CLASS_CONTEXT | (2 << 2)), 2, 0, 0 } /* trnstVehSchAdh */
};
asn_SEQUENCE_specifics_t asn_SPC_CfgTransitVehicleData_specs_1 = {
	sizeof(struct CfgTransitVehicleData),
	offsetof(struct CfgTransitVehicleData, _asn_ctx),
	asn_MAP_CfgTransitVehicleData_tag2el_1,
	3,	/* Count of tags in the map */
	asn_MAP_CfgTransitVehicleData_oms_1,	/* Optional members */
	3, 0,	/* Root/Additions */
	3,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_CfgTransitVehicleData = {
	"CfgTransitVehicleData",
	"CfgTransitVehicleData",
	&asn_OP_SEQUENCE,
	asn_DEF_CfgTransitVehicleData_tags_1,
	sizeof(asn_DEF_CfgTransitVehicleData_tags_1)
		/sizeof(asn_DEF_CfgTransitVehicleData_tags_1[0]), /* 1 */
	asn_DEF_CfgTransitVehicleData_tags_1,	/* Same as above */
	sizeof(asn_DEF_CfgTransitVehicleData_tags_1)
		/sizeof(asn_DEF_CfgTransitVehicleData_tags_1[0]), /* 1 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		SEQUENCE_constraint
	},
	asn_MBR_CfgTransitVehicleData_1,
	3,	/* Elements count */
	&asn_SPC_CfgTransitVehicleData_specs_1	/* Additional specs */
};

