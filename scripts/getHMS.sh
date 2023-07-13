#!/bin/bash

echo "Script is start"

awk -F',' '{print $0}' /mnt/c/Users/AMBATS/Desktop/Batchjob/SourceFile/FDB_Daily_price_updates.csv

#source /mnt/c/Users/AMBATS/Desktop/Batchjob/SourceFile/FDB_Daily_price_updates.csv

echo "Script is running"
