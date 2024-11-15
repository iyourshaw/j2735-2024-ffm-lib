/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollAdvertisementMessage"
 * 	found in "asn/J3217-TollAdvertisementMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_LaneChargesTable_H_
#define	_LaneChargesTable_H_


#include "asn_application.h"

/* Including external dependencies */
#include "LaneID.h"
#include "ChargesTable.h"
#include "constr_SEQUENCE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* LaneChargesTable */
typedef struct LaneChargesTable {
	LaneID_t	 laneId;
	ChargesTable_t	 chargesTable;
	/*
	 * This type is extensible,
	 * possible extensions are below.
	 */
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} LaneChargesTable_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_LaneChargesTable;
extern asn_SEQUENCE_specifics_t asn_SPC_LaneChargesTable_specs_1;
extern asn_TYPE_member_t asn_MBR_LaneChargesTable_1[2];

#ifdef __cplusplus
}
#endif

#endif	/* _LaneChargesTable_H_ */
#include "asn_internal.h"
