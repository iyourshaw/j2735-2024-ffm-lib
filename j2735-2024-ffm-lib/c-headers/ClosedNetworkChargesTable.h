/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollAdvertisementMessage"
 * 	found in "asn/J3217-TollAdvertisementMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ClosedNetworkChargesTable_H_
#define	_ClosedNetworkChargesTable_H_


#include "asn_application.h"

/* Including external dependencies */
#include "EntryChargesTable.h"
#include "ExitChargesTable.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ClosedNetworkChargesTable_PR {
	ClosedNetworkChargesTable_PR_NOTHING,	/* No components present */
	ClosedNetworkChargesTable_PR_entryChargesTable,
	ClosedNetworkChargesTable_PR_exitChargesTable
	/* Extensions may appear below */
	
} ClosedNetworkChargesTable_PR;

/* ClosedNetworkChargesTable */
typedef struct ClosedNetworkChargesTable {
	ClosedNetworkChargesTable_PR present;
	union ClosedNetworkChargesTable_u {
		EntryChargesTable_t	 entryChargesTable;
		ExitChargesTable_t	 exitChargesTable;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ClosedNetworkChargesTable_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ClosedNetworkChargesTable;
extern asn_CHOICE_specifics_t asn_SPC_ClosedNetworkChargesTable_specs_1;
extern asn_TYPE_member_t asn_MBR_ClosedNetworkChargesTable_1[2];
extern asn_per_constraints_t asn_PER_type_ClosedNetworkChargesTable_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _ClosedNetworkChargesTable_H_ */
#include "asn_internal.h"
