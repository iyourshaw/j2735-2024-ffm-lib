/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollAdvertisementMessage"
 * 	found in "asn/J3217-TollAdvertisementMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ChargesTable_H_
#define	_ChargesTable_H_


#include "asn_application.h"

/* Including external dependencies */
#include "VehTypeChargesTable.h"
#include "AxlesChargesTable.h"
#include "WeightChargesTable.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ChargesTable_PR {
	ChargesTable_PR_NOTHING,	/* No components present */
	ChargesTable_PR_vehTypeBased,
	ChargesTable_PR_numAxlesBased,
	ChargesTable_PR_weightBased
	/* Extensions may appear below */
	
} ChargesTable_PR;

/* ChargesTable */
typedef struct ChargesTable {
	ChargesTable_PR present;
	union ChargesTable_u {
		VehTypeChargesTable_t	 vehTypeBased;
		AxlesChargesTable_t	 numAxlesBased;
		WeightChargesTable_t	 weightBased;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ChargesTable_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ChargesTable;
extern asn_CHOICE_specifics_t asn_SPC_ChargesTable_specs_1;
extern asn_TYPE_member_t asn_MBR_ChargesTable_1[3];
extern asn_per_constraints_t asn_PER_type_ChargesTable_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _ChargesTable_H_ */
#include "asn_internal.h"