/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "TollAdvertisementMessage"
 * 	found in "asn/J3217-TollAdvertisementMsg-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_WeightCharges_H_
#define	_WeightCharges_H_


#include "asn_application.h"

/* Including external dependencies */
#include "TotalWeightCharges.h"
#include "PerAxleWeightCharges.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum WeightCharges_PR {
	WeightCharges_PR_NOTHING,	/* No components present */
	WeightCharges_PR_totalWeightCharges,
	WeightCharges_PR_perAxleWeightCharges
	/* Extensions may appear below */
	
} WeightCharges_PR;

/* WeightCharges */
typedef struct WeightCharges {
	WeightCharges_PR present;
	union WeightCharges_u {
		TotalWeightCharges_t	 totalWeightCharges;
		PerAxleWeightCharges_t	 perAxleWeightCharges;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} WeightCharges_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_WeightCharges;
extern asn_CHOICE_specifics_t asn_SPC_WeightCharges_specs_1;
extern asn_TYPE_member_t asn_MBR_WeightCharges_1[2];
extern asn_per_constraints_t asn_PER_type_WeightCharges_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _WeightCharges_H_ */
#include "asn_internal.h"
