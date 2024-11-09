/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadWeatherMessage"
 * 	found in "asn/J2945-3-RoadWeatherMessage-2024-rel-v2.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "NtcipDewPoint.h"

asn_TYPE_member_t asn_MBR_NtcipDewPoint_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct NtcipDewPoint, dewTemp),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_NTCIPEssDewpointTemp,
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
		"dewTemp"
		},
	{ ATF_POINTER, 2, offsetof(struct NtcipDewPoint, source),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_DataSourceInfo,
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
		"source"
		},
	{ ATF_POINTER, 1, offsetof(struct NtcipDewPoint, measurementStdDev),
		(ASN_TAG_CLASS_CONTEXT | (2 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_DewPointTempMeasurementStdDev,
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
		"measurementStdDev"
		},
};
static const int asn_MAP_NtcipDewPoint_oms_1[] = { 1, 2 };
static const ber_tlv_tag_t asn_DEF_NtcipDewPoint_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_NtcipDewPoint_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* dewTemp */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 }, /* source */
    { (ASN_TAG_CLASS_CONTEXT | (2 << 2)), 2, 0, 0 } /* measurementStdDev */
};
asn_SEQUENCE_specifics_t asn_SPC_NtcipDewPoint_specs_1 = {
	sizeof(struct NtcipDewPoint),
	offsetof(struct NtcipDewPoint, _asn_ctx),
	asn_MAP_NtcipDewPoint_tag2el_1,
	3,	/* Count of tags in the map */
	asn_MAP_NtcipDewPoint_oms_1,	/* Optional members */
	2, 0,	/* Root/Additions */
	3,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_NtcipDewPoint = {
	"NtcipDewPoint",
	"NtcipDewPoint",
	&asn_OP_SEQUENCE,
	asn_DEF_NtcipDewPoint_tags_1,
	sizeof(asn_DEF_NtcipDewPoint_tags_1)
		/sizeof(asn_DEF_NtcipDewPoint_tags_1[0]), /* 1 */
	asn_DEF_NtcipDewPoint_tags_1,	/* Same as above */
	sizeof(asn_DEF_NtcipDewPoint_tags_1)
		/sizeof(asn_DEF_NtcipDewPoint_tags_1[0]), /* 1 */
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
	asn_MBR_NtcipDewPoint_1,
	3,	/* Elements count */
	&asn_SPC_NtcipDewPoint_specs_1	/* Additional specs */
};

