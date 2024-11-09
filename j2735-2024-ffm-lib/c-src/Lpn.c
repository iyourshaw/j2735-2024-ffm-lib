/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "EfcDataDictionary"
 * 	found in "asn/ISO17573-EfcDataDictionary.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#include "Lpn.h"

/*
 * This type is implemented using NativeEnumerated,
 * so here we adjust the DEF accordingly.
 */
#if !defined(ASN_DISABLE_OER_SUPPORT)
static asn_oer_constraints_t asn_OER_type_alphabetIndicator_constr_3 CC_NOTUSED = {
	{ 0, 0 },
	-1};
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
static asn_per_constraints_t asn_PER_type_alphabetIndicator_constr_3 CC_NOTUSED = {
	{ APC_CONSTRAINED,	 6,  6,  0,  32 }	/* (0..32) */,
	{ APC_UNCONSTRAINED,	-1, -1,  0,  0 },
	0, 0	/* No PER value map */
};
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
static const asn_INTEGER_enum_map_t asn_MAP_alphabetIndicator_value2enum_3[] = {
	{ 1,	16,	"latinAlphabetNo1" },
	{ 2,	16,	"latinAlphabetNo2" },
	{ 3,	16,	"latinAlphabetNo3" },
	{ 4,	16,	"latinAlphabetNo4" },
	{ 5,	21,	"latinCyrillicAlphabet" },
	{ 6,	19,	"latinArabicAlphabet" },
	{ 7,	18,	"latinGreekAlphabet" },
	{ 8,	19,	"latinHebrewAlphabet" },
	{ 9,	16,	"latinAlphabetNo5" },
	{ 10,	16,	"latinAlphabetNo6" },
	{ 11,	11,	"twoOctetBMP" },
	{ 12,	18,	"fourOctetCanonical" },
	{ 13,	15,	"reservedForUse1" },
	{ 14,	15,	"reservedForUse2" },
	{ 15,	15,	"reservedForUse3" },
	{ 16,	15,	"reservedForUse4" },
	{ 17,	15,	"reservedForUse5" },
	{ 18,	15,	"reservedForUse6" },
	{ 19,	15,	"reservedForUse7" },
	{ 20,	15,	"reservedForUse8" },
	{ 21,	15,	"reservedForUse9" },
	{ 22,	16,	"reservedForUse10" },
	{ 23,	16,	"reservedForUse11" },
	{ 24,	16,	"reservedForUse12" },
	{ 25,	16,	"reservedForUse13" },
	{ 26,	16,	"reservedForUse14" },
	{ 27,	16,	"reservedForUse15" },
	{ 28,	16,	"reservedForUse16" },
	{ 29,	16,	"reservedForUse17" },
	{ 30,	16,	"reservedForUse18" },
	{ 31,	16,	"reservedForUse19" },
	{ 32,	16,	"reservedForUse20" },
	{ 33,	16,	"reservedForUse21" }
};
static const unsigned int asn_MAP_alphabetIndicator_enum2value_3[] = {
	11,	/* fourOctetCanonical(12) */
	0,	/* latinAlphabetNo1(1) */
	1,	/* latinAlphabetNo2(2) */
	2,	/* latinAlphabetNo3(3) */
	3,	/* latinAlphabetNo4(4) */
	8,	/* latinAlphabetNo5(9) */
	9,	/* latinAlphabetNo6(10) */
	5,	/* latinArabicAlphabet(6) */
	4,	/* latinCyrillicAlphabet(5) */
	6,	/* latinGreekAlphabet(7) */
	7,	/* latinHebrewAlphabet(8) */
	12,	/* reservedForUse1(13) */
	21,	/* reservedForUse10(22) */
	22,	/* reservedForUse11(23) */
	23,	/* reservedForUse12(24) */
	24,	/* reservedForUse13(25) */
	25,	/* reservedForUse14(26) */
	26,	/* reservedForUse15(27) */
	27,	/* reservedForUse16(28) */
	28,	/* reservedForUse17(29) */
	29,	/* reservedForUse18(30) */
	30,	/* reservedForUse19(31) */
	13,	/* reservedForUse2(14) */
	31,	/* reservedForUse20(32) */
	32,	/* reservedForUse21(33) */
	14,	/* reservedForUse3(15) */
	15,	/* reservedForUse4(16) */
	16,	/* reservedForUse5(17) */
	17,	/* reservedForUse6(18) */
	18,	/* reservedForUse7(19) */
	19,	/* reservedForUse8(20) */
	20,	/* reservedForUse9(21) */
	10	/* twoOctetBMP(11) */
};
static const asn_INTEGER_specifics_t asn_SPC_alphabetIndicator_specs_3 = {
	asn_MAP_alphabetIndicator_value2enum_3,	/* "tag" => N; sorted by tag */
	asn_MAP_alphabetIndicator_enum2value_3,	/* N => "tag"; sorted by N */
	33,	/* Number of elements in the maps */
	0,	/* Enumeration is not extensible */
	1,	/* Strict enumeration */
	0,	/* Native long size */
	0
};
static const ber_tlv_tag_t asn_DEF_alphabetIndicator_tags_3[] = {
	(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
	(ASN_TAG_CLASS_UNIVERSAL | (10 << 2))
};
static /* Use -fall-defs-global to expose */
asn_TYPE_descriptor_t asn_DEF_alphabetIndicator_3 = {
	"alphabetIndicator",
	"alphabetIndicator",
	&asn_OP_NativeEnumerated,
	asn_DEF_alphabetIndicator_tags_3,
	sizeof(asn_DEF_alphabetIndicator_tags_3)
		/sizeof(asn_DEF_alphabetIndicator_tags_3[0]) - 1, /* 1 */
	asn_DEF_alphabetIndicator_tags_3,	/* Same as above */
	sizeof(asn_DEF_alphabetIndicator_tags_3)
		/sizeof(asn_DEF_alphabetIndicator_tags_3[0]), /* 2 */
	{
#if !defined(ASN_DISABLE_OER_SUPPORT)
		&asn_OER_type_alphabetIndicator_constr_3,
#endif  /* !defined(ASN_DISABLE_OER_SUPPORT) */
#if !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT)
		&asn_PER_type_alphabetIndicator_constr_3,
#endif  /* !defined(ASN_DISABLE_UPER_SUPPORT) || !defined(ASN_DISABLE_APER_SUPPORT) */
#if !defined(ASN_DISABLE_JER_SUPPORT)
		0,
#endif  /* !defined(ASN_DISABLE_JER_SUPPORT) */
		NativeEnumerated_constraint
	},
	0, 0,	/* Defined elsewhere */
	&asn_SPC_alphabetIndicator_specs_3	/* Additional specs */
};

asn_TYPE_member_t asn_MBR_Lpn_1[] = {
	{ ATF_NOFLAGS, 0, offsetof(struct Lpn, countryCode),
		(ASN_TAG_CLASS_CONTEXT | (0 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_CountryCode,
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
		"countryCode"
		},
	{ ATF_NOFLAGS, 0, offsetof(struct Lpn, alphabetIndicator),
		(ASN_TAG_CLASS_CONTEXT | (1 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_alphabetIndicator_3,
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
		"alphabetIndicator"
		},
	{ ATF_NOFLAGS, 0, offsetof(struct Lpn, licencePlateNumber),
		(ASN_TAG_CLASS_CONTEXT | (2 << 2)),
		-1,	/* IMPLICIT tag at current level */
		&asn_DEF_OCTET_STRING,
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
		"licencePlateNumber"
		},
};
static const ber_tlv_tag_t asn_DEF_Lpn_tags_1[] = {
	(ASN_TAG_CLASS_UNIVERSAL | (16 << 2))
};
static const asn_TYPE_tag2member_t asn_MAP_Lpn_tag2el_1[] = {
    { (ASN_TAG_CLASS_CONTEXT | (0 << 2)), 0, 0, 0 }, /* countryCode */
    { (ASN_TAG_CLASS_CONTEXT | (1 << 2)), 1, 0, 0 }, /* alphabetIndicator */
    { (ASN_TAG_CLASS_CONTEXT | (2 << 2)), 2, 0, 0 } /* licencePlateNumber */
};
asn_SEQUENCE_specifics_t asn_SPC_Lpn_specs_1 = {
	sizeof(struct Lpn),
	offsetof(struct Lpn, _asn_ctx),
	asn_MAP_Lpn_tag2el_1,
	3,	/* Count of tags in the map */
	0, 0, 0,	/* Optional elements (not needed) */
	-1,	/* First extension addition */
};
asn_TYPE_descriptor_t asn_DEF_Lpn = {
	"Lpn",
	"Lpn",
	&asn_OP_SEQUENCE,
	asn_DEF_Lpn_tags_1,
	sizeof(asn_DEF_Lpn_tags_1)
		/sizeof(asn_DEF_Lpn_tags_1[0]), /* 1 */
	asn_DEF_Lpn_tags_1,	/* Same as above */
	sizeof(asn_DEF_Lpn_tags_1)
		/sizeof(asn_DEF_Lpn_tags_1[0]), /* 1 */
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
	asn_MBR_Lpn_1,
	3,	/* Elements count */
	&asn_SPC_Lpn_specs_1	/* Additional specs */
};

